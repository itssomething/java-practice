/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.Scanner;

/**
 *
 * @author manhvd
 */
public class Bai1 {
    static int a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[j] < a[i])
                    swap(i,j);
            }
            print(i);
        }
    }
    
    static void swap(int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
    static void print(int x){
        System.out.print("Buoc " + (x+1) + ": ");
        for(int i=0;i<a.length;i++){
            if(i<a.length-1)
                System.out.print(a[i] + " ");
            else
                System.out.print(a[i]);
        }
        System.out.println();
    }
}
