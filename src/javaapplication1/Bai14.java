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

        int[] arr = new int[n];

        int count =0;
        for(int i=0;i<Math.pow(2, n);i++){
            if(check(arr))
                count++;
            arr = gen(arr);
        }
        for(int i=0;i<n;i++){
            arr[i]=0;
        }
        System.out.println(count);
        for(int i=0;i<Math.pow(2, n);i++){
            if(check(arr))
                printArr(arr);
            arr = gen(arr);
        }
                
    }
    
    static void printArr(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]==1)
                System.out.print("A");
            else
                System.out.print("B");
        }
        System.out.println();
    }

    static int[] gen(int[] a){
        for(int i=a.length-1;i>=0;i--){
            if(a[i]==0){
                a[i]=1;
                break;
            }
            else
                a[i]=0;            
        }
        return a;
    }
    static boolean check(int[] a){
        int count = 0;
        for(int i=0;i<a.length-2;i++){
            if(a[i]==1 && a[i+1]==1 && a[i+2]==1)
                count++;
        }
        return count==1;            
    }
    
    
}
