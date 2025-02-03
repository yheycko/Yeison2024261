/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.git2024261;

import java.util.Scanner;

/**
 *
 * @author yheyc
 */
public class Git2024261 {

    public static void main(String[] args) {
       
        System.out.println("YeisonQuinteros2024261");
       
        System.out.println("Hello World!");
        
        // Previous strings work

        double ans, num2;
        int num1;
        
        Scanner myKB = new Scanner(System.in);
        
        System.out.println("Please enter 1st number");
        num1 = myKB.nextInt();
        
        System.out.println("Please enter 2nd number");
        num2 = myKB.nextInt();
        
        //check to see if second num is a zero
        if (num2 == 0){
            
            System.out.println("CANNOT DIVIDE BY ZERO!");
        }
        else {
            //all is OK
            ans = num1 / num2;
            System.out.println("The result of " + num1 + " divided by " + num2 + " is " + ans);
            
        }
    }
}
