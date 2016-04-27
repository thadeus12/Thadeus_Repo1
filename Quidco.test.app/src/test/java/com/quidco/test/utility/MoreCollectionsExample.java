package com.quidco.test.utility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by sewadeus on 10/03/2016.
 */
public class MoreCollectionsExample {

    public static void main(String[] args) {


    LinkedHashMap<Integer,String> linkedHashMap  = new LinkedHashMap<Integer, String>();
    TreeMap<Integer,String> treeHashMap  = new TreeMap<Integer, String>();
        testMap(treeHashMap);

    }

    public static void testMap(Map<Integer,String> bet){
        bet.put(3, "Luke");
        bet.put(2, "Nicloas");
        bet.put(3, "LGloria");
        bet.put(4, "Gilbert");
        bet.put(10,"Bbosa");
        bet.put(5, "LJeff");
        bet.put(6, "Wasswa");
        bet.put(7, "Lethia");

        for (Integer key: bet.keySet()){
            String value = bet.get(key);
            System.out.println(key +": " + value);
        }
    }
}