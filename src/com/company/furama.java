package com.company;

import java.time.chrono.HijrahDate;
import java.util.Scanner;

public class furama {
    static int arr[][] = null;
    static Scanner scanner = new java.util.Scanner(System.in);
    public static void Villa(){
        System.out.println("==Villa==");
        System.out.println("There are 5 villa of empty , Each villa has one bed .");
        System.out.println("One day villa price : 20$ . ");
        System.out.println("Enter the number villa : ");
        int number = scanner.nextInt();
        String[][]Villa = new String[4][number];
        for (int villa = 0; villa < number; villa++) {
            System.out.println("Enter the name : ");
            Villa[0][villa] = scanner.next();
            System.out.println("Enter the number bed : ");
            Villa[1][villa] = scanner.next();
            System.out.println("Enter the number pool: ");
            Villa[2][villa] = scanner.next();
        // em vẫn chưa fix được chỗ in ra mảng 2 chiều
        }
        System.out.println("Name_________Bed__________House");
        for (int villa = 0; villa < number; villa++) {
            System.out.print("" + Villa[0][villa]);
            System.out.print("         " + Villa[1][villa]);
            System.out.println("          " + Villa[2][villa]);
        }
    }
    public static void house(){
        System.out.println("==House==");
        System.out.println("There are 2 house of empty , Each house has 4 bed .");
        System.out.println("One day house price : 80$ . ");
        System.out.println("Enter the number villa : ");
        int number = scanner.nextInt();
        String[][] House = new String[3][number];
        for (int house = 0; house <number; house++) {
            System.out.print("Enter the name : ");
            House[0][house] = scanner.nextLine();
            System.out.print("Enter the number bed: ");
            House[1][house] = scanner.nextLine();
            System.out.print("Enter the number pool: ");
            House[2][house] = scanner.nextLine();

        }
        System.out.println("Name_________Bed__________House");
        for (int house = 0; house < number; house++) {
            System.out.print("        " + House[0][house]);
            System.out.print("        " + House[1][house]);
            System.out.println("      " + House[2][house]);
    }
    }
}
