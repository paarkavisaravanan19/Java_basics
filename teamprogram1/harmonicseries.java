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
public class harmonicseries {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        //int a[]=new int[3];
        System.out.println("enter the number ");
        int num=obj.nextInt();
        System.out.println("the harmonic series");
        double result=0.0;
        while(num>0)
        {
            result=result+(double)1/num;
            num--;
            System.out.println(result+" ");
        }
        System.out.println("the harmonic series of the given number "+result);
        }
    }
    

