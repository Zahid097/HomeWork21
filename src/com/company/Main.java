package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kundu jazynyz: ");
        DayOfWeek days = null;
        try {
            days = DayOfWeek.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            System.out.println("Siz tuura emes jazdynyz!");

        }

        if (days != null) {
            switch (days) {
                case DUYSHOMBU -> System.out.println("JAVA!");
                case SHAYSHEMBI -> System.out.println("Practice lesson!");
                case SHARSHEMBI -> System.out.println("Java!");
                case BEYSHEMBI -> System.out.println("SoftSkills!");
                case JUMA -> System.out.println("English!");
                case ISHEMBI -> System.out.println("Practice Chyngyz!");
                case JEKSHEMBI -> System.out.println("Es alabyz!");
            }
        } else {
            System.out.println("Qayda baratasyz?");
        }
    }
}
