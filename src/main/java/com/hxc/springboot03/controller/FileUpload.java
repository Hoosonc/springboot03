package com.hxc.springboot03.controller;

import com.hxc.springboot03.bean.UserInfo;
import com.hxc.springboot03.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/24
 * Time: 14:19
 */
@Slf4j
@Controller
public class FileUpload {

    @GetMapping("/form_layout")
    public String form_layout(){
        return "file";
    }


    @PostMapping("/upload")
    public String upload(@RequestPart("file") MultipartFile[] files) throws IOException {
        if (files.length>0){
            for (MultipartFile multipartFile : files){
                if (!multipartFile.isEmpty()){
                    String oringinName = multipartFile.getOriginalFilename();
                    File file = new File("E:\\Idea\\upload\\" + oringinName);
                    if (file.exists()){
                        if (file.delete()){
                            System.out.println("=====删了");
                        }else {
                            System.out.println("=======删不掉");
                        }
                        System.out.println("==========有了");
                    }else {
                        long start = System.currentTimeMillis();
                        multipartFile.transferTo(new File("E:\\Idea\\upload\\" + oringinName));
                        long end = System.currentTimeMillis();
                        System.out.println(multipartFile.getOriginalFilename());
                        System.out.println(multipartFile.getResource());
                        System.out.println(end-start);
                    }
                }else {
                    System.out.println("multipartFile是空的");
                }
            }
        }else {
            System.out.println("没有拿到参数");
        }

        return "success";
    }

    @Autowired
    UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping("/userinfo")
    public UserInfo getById(@RequestParam("id") Integer id){
        return userInfoService.getById(id);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/sql")
    public String queryFromDb(){
        Long along = jdbcTemplate.queryForObject("SELECT count(*) FROM login.userinfo",Long.class);
        return along.toString();
    }
//    @RequestMapping("/file")
//    public String changeFileName(@RequestParam("path") String path){
//        File file = new File(path);
//        if(file.exists()){
//            File[] files = file.listFiles();
//            if (null == files || files.length == 0) {
//                System.out.println("文件夹是空的!");
//                return "file";
//            } else {
//                int count = 0;
//                for (File file2 : files) {
//                    count++;
//                    if (file2.isDirectory()) {
//                        changeFileName(file2.getAbsolutePath());
//                    } else {
//                        try {
//                            String data = file2.getName() + ":" + file2.getAbsolutePath();
//                            String filePath = file2.getAbsolutePath();
//                            File textfile =new File("C:\\Users\\10340\\Desktop\\javaio-appendfile.txt");
//                            //if file doesnt exists, then create it
//                            if(!textfile.exists()){
//                                textfile.createNewFile();
//                            }
//                            //true = append file
//                            FileWriter fileWritter = new FileWriter(textfile,true);
//                            fileWritter.write(data);
//                            fileWritter.write("\r\n");
//                            fileWritter.close();
//                        }catch(IOException e){
//                            e.printStackTrace();
//                        }
//                    }
//                }
//                System.out.println(count);
//            }
//        }else{
//            System.out.println("该路径不存在");
//        }
//        return "success";
//    }

}
