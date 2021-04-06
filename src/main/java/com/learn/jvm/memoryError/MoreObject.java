package com.learn.jvm.memoryError;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/28
 */
public class MoreObject {


    static class OOMObject {

    }
    /**
     * -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
     * @param args
     */
    public static void main(String[] args) {
        List<OOMObject> oomObjects = new ArrayList<>();
        while (true) {
            oomObjects.add(new OOMObject());
        }
    }
}
