package Enums;

//value(), valueOf() and ordinal() methods
public class Example2 {

    enum Season{Summer, Winter, Fall}

    public static void main(String[] args) {

        for(Season s : Season.values()){
            System.out.println(s);
        }
        System.out.println("Value of Winter is " + Season.valueOf("Winter"));
        System.out.println("Value of Summer is " + Season.valueOf("Summer").ordinal());
        System.out.println("Value of Fall is " + Season.valueOf("Fall").ordinal());
    }
}
