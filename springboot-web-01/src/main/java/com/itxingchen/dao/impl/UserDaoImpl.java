package com.itxingchen.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.itxingchen.dao.UserDao;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


@Component//标识当前类是一个组件类，交给Ioc容器管理
public class UserDaoImpl implements UserDao {
    @Override
    public List<String> findAll() {
        //1.加载并读取文件
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
        return lines;
    }
}
