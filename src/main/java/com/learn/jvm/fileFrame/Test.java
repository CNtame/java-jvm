package com.learn.jvm.fileFrame;

import java.util.*;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/13
 */
public class Test {

    public static void main(String[] args) {
        List<Integer>[] data = new List[100];
        System.out.println(data[0]);
        List<Integer> d = new ArrayList<>();
        d.add(1);
        data[0] = d;
        System.out.println(data[0]);
        List<Integer> s = data[0];
        //for (Iterator iterator = s.iterator(); iterator.hasNext()) {
        //}

    }

}
