/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;


/**
 *
 * @author user1
 */
public class P3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {1,2,4,5,10,-22,2,-22};
        System.out.println(solve(numbers));
    }
    
    public static int solve(int[] numbers){
        int size = numbers.length, smallest = numbers[0], index = 0;
        
        for(int i = 1; i < 8; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
                index = i;
            }
        }
        
        return index;
    }
    
}
