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
public class CheckPassword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a password please dumbass");
        String password = sc.nextLine();
        boolean valid = true;
        
        password = password.trim();
        System.out.println("your password entered " +password);
        
        if(password.length() < 7)
            valid = false;
        else {
            int countLetter = 0, countDigit = 0;
        
            for(int i = 0; i < password.length() && valid; i++){
                char ch = password.charAt(i);
                if (Character.isLetter(ch))
                    countLetter++;
                else if(Character.isDigit(ch))
                    countDigit++;
                else
                    valid = false;
            }
            
            if(countDigit < 1 || countLetter < 1)
                valid = false;
        }
        
        System.out.println("Your password validity status " + valid);
        
        
        
    }
}
