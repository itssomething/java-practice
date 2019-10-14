/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication1;

import java.util.Scanner;
//import java.util.StringTokenizer;

/**
 *
 * @author manhvd
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String t_arr[] = new String[t];
        int count = 0;
        while(t-- > 0) {
            int n = in.nextInt();
            long arr[] = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            if(isMirrorInverse(arr)){
                t_arr[count] = "YES";
                count++;
            } else {
                t_arr[count] = "NO";
                count++;
            }
        }        
        for(int i = 0;i<t_arr.length; i++){
            System.out.println(t_arr[i]);
        }

    }
    static boolean isMirrorInverse(long arr[]) 
    { 
        int center = (int) Math.floor(arr.length/2);
        for(int i = 0;i<center;i++){
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
        }
        return true;

    } 
    
    static long[] invertUsingFor(long[] array) {
        if(array.length == 0)
        for (int i = 0; i < array.length / 2; i++) {
            long temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
