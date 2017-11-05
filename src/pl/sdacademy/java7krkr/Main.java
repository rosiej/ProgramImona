package pl.sdacademy.java7krkr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("podaj imię");
        Scanner scanner = new Scanner(System.in);
       String name = scanner.nextLine();

       if(name.endsWith("a")){
           System.out.println(name +" jest kobietą");
       }else{
           System.out.println(name+" jest mężczyzną");
       }

    }
}
