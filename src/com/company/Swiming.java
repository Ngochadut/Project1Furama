package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Swiming {
    static int time;
    static int minute;
    static Scanner scanner = new java.util.Scanner(System.in);
    public static void swiming(){
        System.out.println("Welcome to pool !!");
        System.out.println("Opening time is 10:00.");
        System.out.println("The time customers come is : ");
        time = scanner.nextInt();
        System.out.println("The minute customers come is : ");
        minute = scanner.nextInt();
        if(time >= 11){
            System.out.println("Welcome to pool !!");
        }
        else{
            if(11 - time > 1){
                System.out.println("Please wait " );
            }
            int thoiGian = (int)(TimeUnit.HOURS.toMinutes(10) - (TimeUnit.HOURS.toMinutes(time)+ minute));// sử dụng chuyển đổi giờ thành phút
            System.out.println("Please wait "+ thoiGian+" minutes !!");
        }
    }
}
