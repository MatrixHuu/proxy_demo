package org.javaboy.proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author xyma
 * @version 1.0
 * @data 2023/6/26 22:33
 */
public class ProxyDemo02 {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dog.class);
        enhancer.setCallback(new DogInterceptor());
        Dog dog = (Dog) enhancer.create();
        dog.eat();
    }
}
