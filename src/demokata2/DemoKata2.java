package demokata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoKata2 {

    public static void main(String[] args) {
        //Map<Integer, Integer> data = new HashMap<Integer, Integer>();
                
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        map.put(1, 123);
        map.put(2, 123);
        map.put(3, 123);
        map.put(4, 123);
        map.put(5, 125);
        map.put(6, 126);
        
        map.put(4, 42);
        map.put(5, 42);
        
        // Metodo 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println ("M1: Key = " + entry.getKey () + ", Value = " + entry.getValue());
        }
        
        
        // Metodo 2
        //iterar solo sobre claves
        for (Integer key : map.keySet()) {
            System.out.println("M2: Key = " + key);
        }
        //iterar solo sobre valores
        for (Integer value : map.values()) {
            System.out.println("M2: Value = " + value);
        }
        
        
        // Metodo 3
        Iterator<Map.Entry<Integer, Integer>> entries1 = map.entrySet().iterator();
        while (entries1.hasNext()) {
            Map.Entry<Integer, Integer > entry = entries1.next();
            System.out.println("M3a: Key = " + entry.getKey () + ", Value = " + entry.getValue());
        }
        
        Iterator entries2 = map.entrySet().iterator();
        while (entries2.hasNext()) {
            Map.Entry entry = (Map.Entry) entries2.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println("M3b: Key = " + key + ", Value = " + value);
        }
        
        // Metodo 4
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("M4: Key = " + key + ", Value = " + value);
        }
    }
}

     
