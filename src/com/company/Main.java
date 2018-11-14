package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        int choice;
        Customer ctm = new Customer();
        System.out.println("===============FURAMA================");
        System.out.println("*************************************");
        System.out.println("*               Menu                *");
        System.out.println("*1.Add customer                     *");
        System.out.println("*2.Customer infomation              *");
        System.out.println("*3.Customer consultant              *");
        System.out.println("*4.Select house or villa            *");
        System.out.println("*5.Time the pool is open            *");
        System.out.println("*6.Pay                              *");
        System.out.println("*7.Exit                             *");
        System.out.println("*************************************");
        do {
            System.out.print("Enter the choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ctm.addCustomer();
                    break;
                case 2:
                    ctm.information();
                    break;
                case 3:
                    ctm.customerConsultant();
                    break;
                case 4:
                    int choices;
                    furama frm = new furama();
                    System.out.println("4.1 :  Villa");
                    System.out.println("4.2 :  House");
                    System.out.print("Enter the choice ( 1 or 2 ) : ");
                    choices = scanner.nextInt();
                    switch (choices){
                        case 1:
                            frm.Villa();
                            break;
                        case 2:
                            frm.house();
                            break;
                        default:
                            System.out.println("Retype ");
                            break;
                    }
                    break;
                case 5:
                    Swiming sw = new Swiming();
                    sw.swiming();
                    break;
                case 6:
                    ctm.pay(6);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Retype !!");
            }
        } while (choice != 0);
    }
}
