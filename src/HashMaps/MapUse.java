package HashMaps;

import java.util.HashMap;

public class MapUse {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();

        map.put("abc",1);
        map.put("def",2);

        if (map.containsKey("abc")){
            System.out.println("abc is there");
        }
        int i = map.get("abc");
        System.out.println(i);

    }
}
