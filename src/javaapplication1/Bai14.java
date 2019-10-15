/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author manhvd
 */
public class Bai14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int count = 0;
        
        if(n==k){
            System.out.println("1");
            for(int i=0;i<k;i++){
                System.out.print("A");
            }
        }
        else if(n==k-1){
            System.out.println("2"); 
            System.out.print("B");
            for(int i = 0;i<n;i++)
                System.out.print("A");
                System.out.print("\n");
            for(int i = 0;i<-1;i++)
                System.out.print("A");
            System.out.print("B");
            System.out.print("\n");    
        }
        else{
            for(int i=0;i <= n-k+1;i++){
                int left_min = 0;
                int left_max = i;
                int right_min = i+k;
                int right_max = n-k+1;
                
                for(int j = left_min;j<=left_max;j++){
                    genLeft(left_max - left_min);
                    for(int l=right_min;l<=right_max;l++){
                        
                    }
                }
                
            }
        }
    }
    static void genLeft(int a){
        
    }

}
