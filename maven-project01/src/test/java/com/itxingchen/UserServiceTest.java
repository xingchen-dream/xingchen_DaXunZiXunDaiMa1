package com.itxingchen;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayName("用户服务测试类")
public class UserServiceTest {
    /*@Test
    public void testGetAge() {
        UserService userService = new UserService();
        Integer age = userService.getAge("100000200010011011");
        System.out.println(age);
    }

    @Test
    public void testGetGender() {
        UserService userService = new UserService();
        String gender = userService.getGender("100002200010011011");
        System.out.println(gender);
    }

    //*断言
    @Test
    public void testGenderWithAssert() {
        UserService userService = new UserService();
        String gender = userService.getGender("100002200010011011");
        //断言
        Assertions.assertEquals("男", gender, "性别计算错误");
    }


    @Test
    public void testGenderWithAssert2() {
        UserService userService = new UserService();
        //断言
        Assertions. assertThrows(IllegalArgumentException.class, () -> {
            userService.getGender(null);
        });
    }*/
    @BeforeEach
    public void testBefore() {
        System.out.println("before...");
    }

    @AfterEach
    public void testAfter() {
        System.out.println("after...");
    }

    @BeforeAll //该方法必须被static修饰
    public static void testBeforeAll() {
        System.out.println("before all ...");
    }

    @AfterAll //该方法必须被static修饰
    public static void testAfterAll() {
        System.out.println("after all...");
    }

    @Test
    public void testGetAge() {
        Integer age = new UserService().getAge("110002200505091218");
        System.out.println(age);
    }

    @Test
    public void testGetGender() {
        String gender = new UserService().getGender("612429198904201611");
        System.out.println(gender);
    }


    @DisplayName("测试用户性别")
    @ParameterizedTest
    @ValueSource(strings = {"100000200010011011","100000200010011031","100000200010011051"})
    public void testGetGender2(String idCard) {
        UserService userService = new UserService();
        String gender = userService.getGender(idCard);
        //断言
        Assertions.assertEquals("男", gender);
    }
}
