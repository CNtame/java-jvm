package com.learn.jvm.classLoad.staticLoad;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/16
 */
public class Equip {

    private static int num;

    //一个静态初始化块，像一个静态版本的构造器
    // 当类初始化时，构造器被运行
    // 当类加载，静态初始化块被执行，只能执行一次
    static{
        System.out.println("赋值num为5");
        num = 5;
    }

    public static void numLoad() {
        System.out.println("num再次赋值 为6");
        num = 6;
    }
}
