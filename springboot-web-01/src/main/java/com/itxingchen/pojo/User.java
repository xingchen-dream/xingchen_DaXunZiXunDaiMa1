package com.itxingchen.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * 封装用户信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    public Integer id;
    public String username;
    public String password;
    public String name;
    public Integer age;
    public LocalDateTime updateTime;
}
