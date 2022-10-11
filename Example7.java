package Enums;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

//Enum set example
public class Example7 {

    enum days{Sun, Mon, Tues, Wed, Thurs, Fri, Sat}

    public static void main(String[] args) {

        Set<days> set = EnumSet.of(days.Tues, days.Fri);

        //Traversing elements
        Iterator<days> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
