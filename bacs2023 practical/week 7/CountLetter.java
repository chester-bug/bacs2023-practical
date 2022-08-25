/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author user1
 */
public class CountLetter {
    
    public static int countLetter(String str, char ch){
        int count = 0;
        for(int i = 0; i < str.length() ; i++){
            if(str.charAt(i) == ch)
                count++;
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);
        
        int count = CountLetter.countLetter(word, ch);
        
        System.out.println(word + " contains " + count + ch);
    }
}
