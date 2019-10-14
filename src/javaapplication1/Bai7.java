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
public class Bai7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long n = in.nextLong();
        
        int count = 1;
        while(n-- > 0){
            int size = in.nextInt();
            int flatSize = size*size;
            int a[] = new int[flatSize];
            
            // init flat arr
            for(int i=0;i<flatSize;i++){
                a[i] = i + 1;
            }
            System.out.println("Test " + count + ": ");
            printSpiral(a, size);
            count++;
//            for(int i = 0;i<size*size;i++)
//                System.out.print(a[i]);
        }
    }
    
    static void printSpiral(int[] a, int m){
        int b[][] = new int[m][m];
        int left = 0, top = 0;
        int right = m-1, bot = m-1;
        int index = m*m -1;
        while(true){
            if(left>right)
                break;
            for(int i = left; i<=right;i++){
                b[top][i] = a[index];
                index--;
            }
            top++;
            if(top>bot)
                break;
            for(int i = top;i<=bot;i++){
                b[i][right] = a[index];
                index--;
            }
            right--;
            if(left>right)
                break;
            for(int i = right;i>=left;i--){
                b[bot][i] = a[index];
                index--;
            }
            bot--;
            if(top>bot)
                break;
            for(int i = bot;i>=top;i--){
                b[i][left] = a[index];
                index--;
            }
            left++;
        }
        for(int i = 0;i<m;i++)
            for(int j=0;j<m;j++){
                System.out.print(b[i][j]);
                if(j==(m-1))
                    System.out.print("\n");
                else
                    System.out.print(" ");
            }
    }
}
