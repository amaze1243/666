package com.white;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Work02{
    public static void main(String[] args) throws ParseException {
        List<String> lt1=new LinkedList<String>();
        lt1.add("one");
        System.out.println(lt1);
        String s=lt1.get(0);
        System.out.println("获取到的元素是："+s);
        System.out.println("---------------------------");
        List<Integer> lt2=new LinkedList<Integer>();
        lt2.add(1);
        lt2.add(2);
        System.out.println("lt2:"+lt2);
        Integer integer=lt2.get(0);
        System.out.println("获取到的元素是"+integer);
        System.out.println("-----------------------------------");
        List<Double> lt3=new LinkedList<>();

    }
}
