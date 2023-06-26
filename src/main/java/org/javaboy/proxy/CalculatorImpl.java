package org.javaboy.proxy;

/**
 * @author xyma
 * @version 1.0
 * @data 2023/6/26 22:07
 */
public class CalculatorImpl implements Calculator {
    public int add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    public int minus(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
        return a - b;
    }
}
