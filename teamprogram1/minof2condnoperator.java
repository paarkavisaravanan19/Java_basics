/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamprogram1;

import java.util.Scanner;

/**
 *
 * @author NEW
 */
public class minof2condnoperator {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number ");
        int a=obj.nextInt();
        System.out.println("enter the second number ");
        int b=obj.nextInt();
        
        int min;
        min=(a>b?b:a);
        System.out.println("minimum of two numbers "+min);
                
                
    }
    
}
