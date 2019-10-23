/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author manhvd
 */
public class Bai7 {
    static int n;
    static long a[];
    static long temp[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = in.nextLong();
            }
            
            temp = new long[n];
            assign();
            Arrays.sort(a);
            
            int first =0, last =0;
            for(int i=0;i<n;i++){
                if(a[i] != temp[i]){
                    first = i;
                    break;
                }
            }

            for(int i=n-1;i>=0;i--){
                if(a[i] != temp[i]){
                    last = i;
                    break;
                }
            }
            if(compare())
                System.out.println("YES");
            else
                System.out.println(last-first+1);
        }        
    }        
    
    static void assign(){
        for(int i=0;i<a.length;i++){
            temp[i] = a[i];
        }
    }
    
    static boolean compare(){
        for(int i=0;i<a.length;i++){
            if(a[i] != temp[i])
                return false;
        }
        return true;
    }
}
