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
public class Bai18 {
    static boolean xet[];
    static int a[][];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            int m = in.nextInt();
            int u = in.nextInt();
            xet = new boolean[n+1];
            
            a = new int[n+1][n+1];
            
            for(int i=1;i<=m;i++){
                int x = in.nextInt();
                int y = in.nextInt();
                
                a[x][y] = 1;
                a[y][x] = 1;
            }
            
            System.out.print(u + " ");
            dfs(u,n);
            System.out.println();
        }
    }
    
    static void dfs(int u, int n){
        xet[u] = true;
        for(int v=1; v<=n;v++){
            if(a[u][v] == 1 && !xet[v]){
                System.out.print(v + " ");
                dfs(v, n);
            }
        }
    }
}
