package Enums;

//Specifying initial values to the enum constants
public class Example5 {

    enum Season {
        Winter(4), Summer(5), Spring(3), Fall(2);

        private int value;

        private Season(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        for(Season s : Season.values()){
            System.out.println(s + " " + s.value);
        }
    }
}
