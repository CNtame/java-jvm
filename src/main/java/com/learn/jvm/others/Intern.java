package com.learn.jvm.others;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/6
 */
public class Intern {


    public static void main(String[] args) {


        /*
         * intern作用：如果常量池中已经有了这个字符串，那么直接返回这个引用，
         * 如果没有，则在常量池中增加一个Unicode等于str的字符串，并返回引用
         *
         */
        String str1 = new String("1");
        System.out.println(str1.intern() == str1);

        String str2 = new String("测试");
        System.out.println(str2.intern() == str2);

        String str3 = "2";
        System.out.println(str3.intern() == str3);

        String str4 = "计算机";
        System.out.println(str4.intern() == str4);

        String str5 = new StringBuffer("操作").append("减号").toString();
        System.out.println(str5.intern() == str5);

        String str6 = new StringBuffer("ja").append("va").toString();
        System.out.println(str6.intern() == str6);

        /*
         * false
         * true
         */
        String str7 = "测试";
        String str8 = new String("测试");

        System.out.println(str7 == str8);
        System.out.println(str7.intern() == str8.intern());

    }



}
