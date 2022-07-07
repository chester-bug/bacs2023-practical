/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

import java.util.Scanner;

/**
 *
 * @author user1
 */
public class q2 {
    public static void main(String[] args) {

    //  construct scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age (years): ");
        int age = sc.nextInt();
        
        System.out.println("Age in years: " + age + "years");
        System.out.println("Age in days: " + age*365 + "days");
        System.out.println("Age in seconds: " + age*365*24*60*60 + "seconds");



    }
}
