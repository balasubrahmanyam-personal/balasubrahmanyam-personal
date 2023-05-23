package map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"B");
        map.put(4,"A");
        map.put(6,"C");
        map.put(8,"D");
        map.put(10,"E");

        //Map.Entry<Integer,String> entry = map.entrySet();
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"===="+entry.getValue());
        }
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(2,"B");
        map1.put(4,"A");
        map1.put(6,"C");
        map1.put(8,"D");
        map1.put(10,"E");

        //Map.Entry<Integer,String> entry = map.entrySet();
        for(Map.Entry<Integer,String> entry : map1.entrySet()){
            System.out.println(entry.getKey()+"===="+entry.getValue());
        }
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(10);
        list.add(5);
        list.add(5);
        Iterator itr = list.iterator();
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
//compute,computeIfAbsent,getOrDefault,merge,putIfAbsent