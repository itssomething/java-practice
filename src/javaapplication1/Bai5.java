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
public class Bai5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][]a = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = in.nextInt();
            }
        }
        
        chuyenvi(a, m, n);
        
    }
    static void chuyenvi(int[][] a, int m, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j<m-1)
                    System.out.print(a[j][i] + " ");
                else
                    System.out.print(a[j][i] + "\n");
            }
        }
    }
}
