package com.yang.start;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        HashSet<Object> set = new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);


        System.out.println(JSON.toJSONString(set));


    }

}
