/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;


/**
 *
 * @author user1
 */
public class P3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num[] = new int[6];
        int deno[] = {100,50,20,10,5,1};
        int total = 0;
        
        for(int i = 0; i < 6; i++){
            System.out.printf("Please enter the quantity of RM %d: ",deno[i]);
            num[i] = sc.nextInt();
        }
        
        System.out.println("\nYour input is:");
        System.out.printf("%-22s%-15s\n","Denomination (RM)","Quantity");
        for(int j = 0; j < 6; j++){
            if(num[j] != 0){
                System.out.printf("%12d%13s%-7d\n",deno[j],"",num[j]);
            }
        }
        
        System.out.println("\nYour output is:");
        System.out.printf("%-22s%-15s%9s\n","Denomination (RM)","Quantity","Value (RM)");
        for(int j = 0; j < 6; j++){
            if(num[j] != 0){
                System.out.printf("%12d%13s%-7d%14d\n",deno[j],"",num[j],num[j]*deno[j]);
                total += num[j]*deno[j];
            }
        }
        System.out.printf("Total = RM %d\n",total);
    }
}
