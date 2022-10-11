package Enums;

//allOf() and noneOf()

import java.util.EnumSet;
import java.util.Set;

enum days{Sun, Mon, Tues, Wed, Thu, Fri, Sat};

public class Example8 {

    public static void main(String[] args) {

        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println(set1);
        Set<days> set2 = EnumSet.noneOf(days.class);
        System.out.println(set2);
    }
}
