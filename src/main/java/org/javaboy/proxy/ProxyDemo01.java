package org.javaboy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xyma
 * @version 1.0
 * @data 2023/6/26 22:10
 */
public class ProxyDemo01 {
    public static void main(String[] args) {
        final CalculatorImpl calculatorImpl = new CalculatorImpl();
        Calculator calculator = (Calculator) Proxy.newProxyInstance(ProxyDemo01.class.getClassLoader(), new Class[]{Calculator.class}, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long startTime = System.nanoTime();
                Object invoke = method.invoke(calculatorImpl, args);
                long endTime = System.nanoTime();
                System.out.println(method.getName() + "方法执行耗时" + (endTime - startTime) + "纳秒");
                return invoke;
            }
        });
        calculator.add(3, 4);
    }
}
