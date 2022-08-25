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
public class ModifyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String newStr = str.toUpperCase();
        
        char[] vowels = {'A','E','I','O','U'};
        
        for(char vowel:vowels)
            newStr = newStr.replace(vowel, 'x');
        
        System.out.println("The new string is " + newStr);
        
    }
}
