package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/* ..Hashmap..
	 Map stores the key value pairs.
	 */
        // In this order is not maintained.

    // key,value.

    Map<String,Integer> map = new HashMap<>();
    map.put("one",1);
    map.put("two",1);
    map.put("three",1);
    map.put("four",1);
    System.out.println(map);


        // iteration in map

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e);

            // to get the keys of map
            System.out.println(e.getKey());
            // to get the values of map
            System.out.println(e.getValue());

        }
        // keyset() method added.
        System.out.println(map.keySet());

    }


}
