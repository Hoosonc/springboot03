package com.hxc.springboot03.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@TableName("") 实际指明表名
public class User {

//    @TableField(exist = false) 数据库表中是否存在
    private Long id;
    private String name;
    private Integer age;
    private String email;
}