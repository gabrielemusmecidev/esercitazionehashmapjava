/*
7. Test if a map contains a mapping for the specified key.

8. Test if a map contains a mapping for the specified value.

9. To create a set view of the mappings contained in a map.

10. To get the value of a specified key in a map.

11. To get a set view of the keys contained in this map.

12. To get a collection view of the values contained in this map.
         */


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //1. Associate the specified value with the specified key in a HashMap.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Giorgio", 1945);
        map.put("Alberto", 2001);
        map.put("Giorgino",1955);
        map.put("Nerino",1963);
        //2. Count the number of key-value (size) mappings in a map.
        int size= map.size();
        System.out.println(size);
        //3. Copy all the mappings from the specified map to another map.
        HashMap<String, Integer> map2 = new HashMap<>(map);
        System.out.println(map2);
        //Usando putAll
        /*
        HashMap<String, Integer> map3 = new HashMap<>();
         map3.putAll(map);
         */
        //4. Remove all the mappings from a map.
        map2.clear();
        //5. Check whether a map contains key-value mappings (empty) or not.
        boolean vuota=map.isEmpty();
        if (vuota) System.out.println("Hash Map Vuota");
        else System.out.println("Hash Map Piena");
        //6. Get a shallow copy of a HashMap instance.
        HashMap<String, Integer> map4 = new HashMap<>();
        map4=(HashMap)map.clone();








    }

}