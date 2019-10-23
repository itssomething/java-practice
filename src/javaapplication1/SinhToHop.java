/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author manhvd
 */
public class SinhToHop {
    public static int a[], n, k;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        a = new int[k];
        
        for(int i =0;i<k;i++){
            a[i] = i+1;
        }
//        a = new int[]{1,3,5};
        
        int i=k-1;
        while(a[0]<=n-k+1){
            print();

            while(i>0 && a[i] == n-k+i+1){
                i--;
            }
            a[i]++;
            while(i<k-1){
                a[i+1]=a[i]+1;
                i++;
            }
        }
    }
    
    
    
    
    static void print(){
        for(int i=0;i<k;i++)
            System.out.print(a[i]);
        System.out.println();
    }
}
    
    
