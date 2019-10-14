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
public class Bai10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = Integer.parseInt(s);
        
        while(n-- >0){
            String ss = in.nextLine();
            if(check(ss))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    static boolean check(String ss){
        String[] arr = ss.split("");
        return Arrays.equals(arr, reverse(arr)) && checkPrime(ss);
        
    }
    static String[] reverse(String[] a){
        String[] b = new String[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[a.length-i-1];
        }
        return b;
    }
    static boolean checkPrime(String s){
        String[] arr = s.split("");
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(!checkNumPrime(Integer.parseInt(arr[i])))
                flag = 1;
        }
        return flag == 0;
    }
    static boolean checkNumPrime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;                    
        }
        return count==2;
    }
}
