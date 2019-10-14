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
public class Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count = 1;

        while(t-- > 0){
            int n = in.nextInt();
            int arr[] = new int[n];
            
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            System.out.println("Test " + count + ":");
            System.out.println(countMax(arr));
            printMax(arr, countMax(arr));
            count++;
        }
    }
    
    static void printMax(int[] arr, int max){
        int ans = 0, anchor = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (i > 0 && arr[i-1] >= arr[i]) anchor = i;
            if(i - anchor + 1 == max)
                for(int j = anchor; j <= i;j++){
                    if(j<i)
                        System.out.print(arr[j] + " ");
                    else
                        System.out.print(arr[j] + "\n");
                }
        }
        

    }
    static int countMax(int[] arr){
        int count = 1;
        int max = 0;
        if(arr.length <= 1)
            return 1;
        
        for(int i = 0;i<arr.length-1;i++){
            int previous = arr[i];
            int next = arr[i+1];
            if(next>previous){
                count++;
                max = Math.max(max, count);
            }
            else {
                count = 1;
            }
        }
        return max;
    }
}
