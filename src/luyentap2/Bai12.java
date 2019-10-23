/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.Scanner;

/**
 *
 * @author manhvd
 */
public class Bai12 {
    static long m;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        m = (long) (1e9+7);
        while(t-- >0){
            int n = in.nextInt();
            int k = in.nextInt();
            
            System.out.println(pow(n,k));
        }
    }
    static long pow(int n, int k){
        if(k==0)
            return 1;
        long x = pow(n, k/2);
        if(k%2 == 0)
            return (x*x) % m;
        return (x*x%m) * n%m;
    }
}
