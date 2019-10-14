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
public class Bai9 {
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
    static boolean check(String s){
        String arr[] = s.split("");
//        System.out.println(arr[0]);
        return sum(arr)%10==0 && Arrays.equals(arr, reverse(arr)) && Integer.parseInt(arr[0]) == 8 && Integer.parseInt(arr[arr.length-1]) == 8;
    }
    
    static int sum(String[] s){
        int sum = 0;
        for(int i=0;i<s.length;i++){
            sum=sum+ Integer.parseInt(s[i]);
        }
        return sum;
    }
    
    static String[] reverse(String[] arr){
        String[] b = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            b[i] = arr[arr.length-1-i];
        }
        return b;
    }
}
