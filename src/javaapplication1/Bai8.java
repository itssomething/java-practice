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
public class Bai8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ns = in.nextLine();
        long n = Long.parseLong(ns);
        
        while(n-- >0){
            String s = in.nextLine();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
    }
    static boolean check(String s){
        String[] arr = s.split("");
        boolean is_even;
        is_even = Integer.parseInt(arr[arr.length - 1]) % 2 == 0;
        return(is_even && Arrays.equals(arr, reverse(arr)));
    }
    
    static String[] reverse(String[] a){
        int l = a.length;
        String[] b = new String[l];
        for(int i=0;i<l;i++){
            b[i] = a[l-1-i];
        }
        return b;
    }
}
