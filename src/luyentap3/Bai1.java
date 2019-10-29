/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author manhvd
 */
public class Bai1 {
    static int smax =0, s=0, n;
    static int[] a;
    static boolean[] c;
    static int cap;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        cap = in.nextInt();
        n = in.nextInt();
        
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        

        
        System.out.println(smax);
    }
    
    static void select(){
        for(int i=0;i<n;i++){
            if(!c[i] && (s + a[i]) <= cap){
                c[i] = true;
                s+= a[i];
                select();
                c[i] = false;
                s-=a[i];
            }
        }        
    }
}
