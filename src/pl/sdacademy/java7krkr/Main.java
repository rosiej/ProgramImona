package pl.sdacademy.java7krkr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imię");
        String name = scanner.nextLine();

        while (!name.isEmpty()) {

            if (name.endsWith("a")) {
                System.out.println(name + " jest kobietą");
            } else {
                System.out.println(name + " jest mężczyzną");
            }
            System.out.println("podaj imię");
            name = scanner.nextLine();
        }
    }
}


