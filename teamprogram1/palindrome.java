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
public class palindrome {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number ");
        int a=obj.nextInt();
        int r,k=0;
        int n=a;
        while(n>0){
            r=n%10;
            k=(k*10)+r;
            n=n/10;
            
        }
        if(a==k){
            System.out.println("the given number "+a+ "is palindrome ");
        }
        else{
            System.out.println("the given number "+a+" is not palindrome ");
        }
    }
    
}
