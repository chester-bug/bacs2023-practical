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
        System.out.print("Enter number of quiz scores to process: ");
        int size = sc.nextInt();
        
        int score[] = new int[size], scoreAbove = 0, scoreBelow = 0;
        double totalScore = 0;
        
        for(int i = 0; i < size; i ++){
            System.out.print("Score "+(i+1)+": ");
            score[i] = sc.nextInt();
            totalScore += score[i];
        }
        for(int i = 0; i < size; i ++){
            if(score[i] >= totalScore/size){
                scoreAbove++;
            } else if (score[i] < totalScore/size){
                scoreBelow++;
            }
        }
        
        System.out.println("\nResults");
        System.out.println("======");
        System.out.printf("The average number is: %.1f\n", totalScore/size);
        System.out.printf("Number of scores above or equal to the average is %d \n", scoreAbove);
        System.out.printf("Number of scores below the average is %d \n", scoreBelow);
    }
    
}
