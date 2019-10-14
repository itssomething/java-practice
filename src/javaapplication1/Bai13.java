/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import static javaapplication1.Bai12.chuanHoa;

/**
 *
 * @author manhvd
 */
public class Bai13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = Integer.parseInt(s);
        String[] store = new String[n];
        
        while(n-- >0){
            String ss = in.nextLine();
//            chuanHoa(ss);
            store[n] = getName(ss);
            System.out.println(chuanHoa(ss));
        }
    }
    
    static String chuanHoa(String s){
        s = s.replaceAll("\\s+", " ");

        return s;
    }
    static String getName(String s){
        String[] ss = s.replaceAll("\\s+", " ").split(" ");
        return ss[ss.length-1].toLowerCase();
    }
    static int getNum(
    )
    static String mail(String s, int num){
        String arr[] = s.split(" ");
        String first_name = arr[arr.length-1];
        String last = arr[0].split("")[0];
        String middle = arr[1].split("")[0];
        String result = first_name + last+ middle + "@ptit.edu.vn";
    }
}
