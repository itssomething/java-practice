/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author manhvd
 */
public class Bai12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = Integer.parseInt(s);
        
        while(n-- >0){
            String ss = in.nextLine();
//            chuanHoa(ss);
            System.out.println(chuanHoa(ss));
        }
    }
    
    static String chuanHoa(String s){
        s= s.replaceAll("\\s+", " ");
        s = s.trim();
        String arr[] = s.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i].toLowerCase();
            arr[i] = capitalize(arr[i]);
        }
        s = String.join(" ", arr);
        return s;
    }
    
    static String capitalize(String a){
        String cap = a.substring(0, 1).toUpperCase() + a.substring(1);
        return cap;
    }
}
