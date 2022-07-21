/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author user1
 */
public class P3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of quiz...");
        
        int score[] = new int[10], totalScore = 0;
        
        for(int i = 0; i < 5; i ++){
            System.out.print("Score "+(i+1)+": ");
            score[i] = sc.nextInt();
            totalScore += score[i];
        }
        
        System.out.println("The average number is: " + totalScore/5);
    }
    
}
