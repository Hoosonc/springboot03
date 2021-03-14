package com.hxc.springboot03.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/25
 * Time: 23:07
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfo {
    private Integer id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
}
