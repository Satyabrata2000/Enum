package Enums;

import java.sql.SQLOutput;

//Enum in a switch statement
public class Example6 {

    enum Day{Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}

    public static void main(String[] args) {
         Day day = Day.Monday;

         switch (day){
             case Sunday:
                 System.out.println("Sunday");
                 break;
             case Monday:
                 System.out.println("Monday");
                 break;
             default:
                     System.out.println("Other day");
         }
    }
}
