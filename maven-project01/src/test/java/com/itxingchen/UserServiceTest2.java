package com.itxingchen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest2 {

    private final UserService userService = new UserService();

    // 测试 getGender 方法
    @Test
    @DisplayName("获取性别 - 正常女性身份证")
    public void testGetGenderFemale() {
        String gender = userService.getGender("100000200010011021");
        assertEquals("女", gender);
    }

    @Test
    @DisplayName("获取性别 - 正常男性身份证")
    public void testGetGenderMale() {
        String gender = userService.getGender("10000020001001101X");
        assertEquals("男", gender);
    }

    @Test
    @DisplayName("获取性别 - 身份证号为空")
    public void testGetGenderNullIdCard() {
        assertThrows(IllegalArgumentException.class, () -> userService.getGender(null));
    }

    @Test
    @DisplayName("获取性别 - 身份证号长度不为18")
    public void testGetGenderInvalidLength() {
        assertThrows(IllegalArgumentException.class, () -> userService.getGender("12345678901234567"));
    }

    // 测试 getAge 方法
    @Test
    @DisplayName("获取年龄 - 正常身份证")
    public void testGetAgeNormal() {
        Integer age = userService.getAge("100000200010011011");
        assertEquals(24, age); // 根据当前年份调整预期值
    }

    @Test
    @DisplayName("获取年龄 - 身份证号为空")
    public void testGetAgeNullIdCard() {
        assertThrows(IllegalArgumentException.class, () -> userService.getAge(null));
    }

    @Test
    @DisplayName("获取年龄 - 身份证号长度不为18")
    public void testGetAgeInvalidLength() {
        assertThrows(IllegalArgumentException.class, () -> userService.getAge("12345678901234567"));
    }
}
