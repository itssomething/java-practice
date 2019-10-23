package javaapplication1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manhvd
 */
public class Bai15 {
    static int a[], n, k;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            n = in.nextInt();
            k = in.nextInt();
            a = new int[k];

            for(int i=0;i<k;i++){
                a[i] = in.nextInt();                 
            }
            gen();
            print();

        }
    }
    
    static void gen(){
        for(int i=k-1;i>=0 ;i--){
            if(a[i]<n-k+i+1){
                a[i]++;
                break;
            } else{
                int j = i-1;
                a[j]++;
                a[j+1]=a[j]+1;
                break;
            }
        }
            
    }
    
    static void print(){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
