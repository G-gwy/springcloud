package com.gggsl.springcloud.provider.javaBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BaseType {
    public static void main(String[] args) {
        int a = 1;
        Integer b = new Integer(1);
        Integer c = 1;//
        Integer d = new Integer(1);
        System.out.println(a == b); //true
        System.out.println(a == c);//true
        System.out.println(b.equals(a));//true
        System.out.println(b == c);//false
        System.out.println(b.equals(c)); //true
        System.out.println(b.equals(d));//true
        System.out.println(b == d);//false
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("111");
        list.add("2222");
        AtomicInteger aa = new AtomicInteger();
        list.forEach((ls)->{
            list1.add("222");
            aa.set(2);
        });
        list.forEach(System.out::println);
        
    }
}
