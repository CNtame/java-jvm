package com.learn.jvm.fileFrame;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/13
 */
public class TestClass {

    private String userName;

    private static final String NUM = "2";

    private static int age;

    private final int money = 1;

    public void setUserInfo(String userName, int age) {
        this.age=age;
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
