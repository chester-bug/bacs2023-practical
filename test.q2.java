/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package p1;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class q1 {

    public static void main(String[] args) {
        
//        construct scanner
        Scanner sc = new Scanner(System.in);
        
        final int YEAR = 365;
        final int SECOND = 365*24*60*60;
        
        //initialize variables
        String name, year, cgpa;

        
        System.out.println("Enter name: ");
        name = sc.nextLine();
                
        System.out.println("Enter your year of study: ");
        year = sc.nextLine();
        
        System.out.println("What is your target GPA for this semester? ");
        cgpa = sc.nextLine();
        
        // output
        System.out.println("Welcome " + name + "!");
        System.out.println("Work hard to achieve your target GPA of "+cgpa+" this semester of your Year "+year+".");
        
    }
}
