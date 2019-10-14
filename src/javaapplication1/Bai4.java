/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication1;

import java.util.Scanner;
import java.util.stream.IntStream;


/**
 *
 * @author manhvd
 */
public class Bai4 {
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
            int[] noDuplicates = IntStream.of(arr).distinct().toArray();
            printOcc(noDuplicates, arr);
            count++;
        }
    }
    
    static void printOcc(int[] new_arr, int[] old_arr){
        int count = 0;
        for(int i=0;i<new_arr.length;i++){
            for(int j = 0;j<old_arr.length;j++){
                if(new_arr[i] == old_arr[j])
                    count++;
            }
            System.out.println(new_arr[i] + " xuat hien " + count + " lan");
            count = 0;
        }
    }
}
