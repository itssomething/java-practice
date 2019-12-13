/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap3;

import java.util.Scanner;

/**
 *
 * @author manhvd
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();
        int len_a = A.length();
        int len_b = B.length();
        
        int[][] F = new int[1001][1001];

        for(int i=0;i<=len_a;i++)
            F[i][0] = 0;
        for(int j=0;j<=len_a;j++)
            F[0][j] = 0;
        
        for(int i=1;i<=len_a;i++){
            for(int j=1;j<=len_b;j++){
                if(A.charAt(i-1) == B.charAt(j-1))
                    F[i][j] = F[i-1][j-1] + 1;
                else
                    F[i][j] = Math.max(F[i-1][j], F[i][j-1]);
            }           
        }
        
        int max = 0;
        for(int i=0;i<=len_a;i++){
            for(int j=0;j<=len_b;j++){
                max = Math.max(max, F[i][j]);
            }
        }
        System.out.println(max);
    }
}
