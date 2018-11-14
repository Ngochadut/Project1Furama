package com.company;

import java.util.Scanner;

public class Customer {
    static Scanner scanner = new java.util.Scanner(System.in);
    static String name;
    static int age,date;
    static int money;

    public static void addCustomer(){
        System.out.println("=========== WELCOME TO FURAMA ============");
        System.out.println("*           Add customer                 *");
        System.out.print("Enter the name : ");
        name = scanner.nextLine();
        System.out.print("Enter the age  : ");
        age = scanner.nextInt();
        System.out.print("Enter the date : ");
        date = scanner.nextInt();
    }

    public static void information(){
        System.out.println("************************Customer infomation*********************************");
        System.out.println("*Name : " + name + " Age : " +age + " Date : " + date + "                  *");
        System.out.println("****************************************************************************");
    }

    public static void customerConsultant(){
        System.out.println("Customer consultant :   ");
        int money;
        System.out.println("Enter the amount of money the customer has : ");
        int amount = scanner.nextInt();
        money = date*20 ;
        if((amount - money)>0)
            System.out.println("If customers rent villa for "+ date + "days , amount to be paid " + money + " amount left over : "+ (amount - money) + " $ .");
        else
            System.out.println("If customers rent villa for "+ date + " . Not enough cost !!");
        money = date*80;
        if((amount - money)>0)
            System.out.println("If customers rent house for "+ date + "days , amount to be paid " + money + " amount left over : "+ (amount - money) + " $ .");
        else
            System.out.println("If customers rent villa for "+ date +"days . Not enough cost !!");
    }

    public static int pay(int money ){
        int choice;
        System.out.println("Enter the choice 1.villa or 2.house: ");
        choice = scanner.nextInt();
        if (choice == 1) {
            money = date*20;
            System.out.println("**********************Bill*************************");
            System.out.println("*Amount to be paid for the villa : " + money + " $           *");
            System.out.println("***************************************************");
            return money;
        } else if (choice == 2) {
            money = date*80;
            System.out.println("**********************Bill*************************");
            System.out.println("*Amount to be paid for the house : " + money + " $           *");
            System.out.println("***************************************************");
        }
        return money;
    }

}

