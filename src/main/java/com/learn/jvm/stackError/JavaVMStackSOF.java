package com.learn.jvm.stackError;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/28
 */
public class JavaVMStackSOF {
    private int stackLength = 1;
    private void stackLeak() {
        stackLength++;
        stackLeak();
    }
    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("Stack length: " + oom.stackLength);
            throw e;
        }
    }
}
