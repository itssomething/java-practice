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
public class Bai6 {
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
        int[][]b = new int[n][m];
        b = chuyenvi(a, m, n);
//        int[][]c = new int[m][m];
//        tich(a,b,c,m);
        
        for(int i=0;i<n;i++){
            for(int j=0;i<m;j++){
                if(j<m-2)
                    System.out.print(b[i][j] + " ");
                else
                    System.out.println(b[i][j] + "\n");
            }
        }
        
//        for(int i=0;i<m;i++){
//            for(int j=0;i<m;i++){
//                if(j<m-1)
//                    System.out.print(c[i][j] + " ");
//                else
//                    System.out.println(c[i][j] + "\n");
//            }
//        }
    }
    static int[][] chuyenvi(int[][] a,int m, int n){
        int[][] b = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               b[i][j] = a[j][i];
            }
        }
        return b;
    }
    static int[][] tich(int[][] a, int [][] b, int[][] c, int m){
        for(int i=0;i<m;i++){
            for(int j=0;i<m;i++){
                c[i][j]= a[i][j]*b[j][i];
            }
        }
        return c;
    }
}
