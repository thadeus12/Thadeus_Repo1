package com.quidco.test.utility;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class CollectionsExample {
    public static void main(String[] args) {
        HashMap<Integer,String> bet = new HashMap<Integer, String>();
        LinkedHashMap<Integer,String> linkedHashMap  = new LinkedHashMap<Integer, String>();
        TreeMap<Integer,String> treeHashMap  = new TreeMap<Integer, String>();

        bet.put(3, "Luke");
        bet.put(2, "Nicloas");
        bet.put(3, "LGloria");
        bet.put(4, "Gilbert");
        bet.put(5, "LJeff");
        bet.put(6, "Wasswa");
        bet.put(7, "Lethia");
        String friend = bet.get(2);
        System.out.println(friend);;

// declaring a variable called bet.entry of interger string
        for (Map.Entry<Integer,String> entry: bet.entrySet()){
            int key= entry.getKey();
            String value = entry.getValue();
            System.out.println(key+ ": " + value);

        }


    }
}
