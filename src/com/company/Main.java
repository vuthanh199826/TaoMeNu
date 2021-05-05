package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        while (choice !=0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1 . Ve Tam Giac");
            System.out.println("1 . Ve Hinh Vuong");
            System.out.println("1 . Ve Hinh Chu Nhat");
            System.out.println("Enter yout choice");
            choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 10; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    default:
                        System.out.println("nhap lai");

                }
            }
        }
    }

