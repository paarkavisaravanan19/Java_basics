/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamprogram1;

/**
 *
 * @author NEW
 */
public class sumofallnum100to200by7 {
    public static void main(String args[]){
        int sum=0;
        int i,n;
        for(i=100;i<=200;i++){
            n=i%7;
            if(n==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of number that is divisible by 7 between 100 to 200 "+sum);
    }
    
        }
    
    

