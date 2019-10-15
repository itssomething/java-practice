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
public class Bai13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count = 0;
        while(t-- >0){
            int n = in.nextInt();
            int k = in.nextInt();
            
            int[] currentArr = new int[n];
            
            for(int i=0;i<n;i++){
                currentArr[i] = 0;
            }
            
            for(int i =0;i<n*n;i++){
                if(check(currentArr, k)){
                    printArr(currentArr);
                }
                currentArr = nextArr(currentArr);
            }
        }
    }
    static void printArr(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);            
        }
        System.out.print("\n");
    }
    
    static int[] nextArr(int[] a){
        for(int i=a.length-1;i>=0;i--){
            if(a[i]==1)
                a[i]=0;
            else{
                a[i]=1;
                break;
            }
        }
        return a;
    }
    static boolean check(int[] a, int k){
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] == 1)
                count++;
        }
        return count == k;
    }
}
