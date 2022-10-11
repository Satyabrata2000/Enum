package Enums;

class Example1{

    public enum Season{Winter, Spring, Summer, Fall}

    public static void main(String[] args) {

        for(Season s : Season.values()){
            System.out.println(s);
        }

    }
}
