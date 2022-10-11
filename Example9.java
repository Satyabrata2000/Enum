package Enums;

//Java enum map

import java.util.EnumMap;
import java.util.Map;

public class Example9 {

    enum Days{a, b, c, d, e, f};

    public static void main(String[] args) {
        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
        map.put(Days.a, "1");
        map.put(Days.b, "2");
        map.put(Days.c, "3");

        for(Map.Entry object : map.entrySet()){
            System.out.println(object.getKey() + " : " + object.getValue());
        }
    }
}
