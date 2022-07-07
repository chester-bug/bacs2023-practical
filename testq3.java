/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.p3;

import java.util.Scanner;

/**
 *
 * @author user1
 */
public class q3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter 8-digit credit card no: ");
            int cardNo = sc.nextInt();
            int sum1 = 0, temp1 = cardNo;
            
            for(int i=1;i<=4;i++){
                sum1+=temp1%10;
                temp1 /= 100;
            }
            
            int sum2 =0, temp2 = cardNo /10;
            
            for(int j=1; j<=4; j++){
                sum2+= (temp2%10)*2;
                sum2+= digit % 10;
                sum+= digit/10;
                temp2 /= 100;
            }
            
            int finalSum = sum1 + sum2;
            
            if(finalSum % 10 ==0){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
                System.out.println("The last check digit should be " + ((cardNo-finalSum + 10) % 10));
            }
    }
}
