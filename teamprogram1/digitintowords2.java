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
public class digitintowords2 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the integer");
        int num=obj.nextInt();
        int temp=num,digit,i=0;
        int a[]=new int[10];
        
        for(;temp!=0;i++)
        {
            digit=temp%10;
            temp=temp/10;
            a[i]=digit;
        }
        System.out.println("Spliting the integer into words ");
        
        for(int j=i-1;j>=0;j--){
            switch(a[j])
            {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                default:
                    System.out.println("nine");
                    break;
                 
                    
            }
        }
    }
    
}
