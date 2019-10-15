/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author manhvd
 */
public class Bai11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = Integer.parseInt(s);
//        String[] store = new String[n];
        HashMap<String, Integer> store = new HashMap<>();
        String[] result = new String[n];
                
        int count=0;
        while(n-- >0){
            String ss = in.nextLine();
            ss = chuanHoa(ss);
            String name = getName(ss);
            if(!store.containsKey(name))
                store.put(name, 1);
            else
                store.put(name, store.get(name) + 1);
            
            result[count] = (makeEmail(ss, store.get(name)));
            count++;
        }
        for(int i=0;i<result.length;i++){
            System.out.println(result[i] + "@ptit.edu.vn");
        }
    }
    
    static String chuanHoa(String s){
        s = s.replaceAll("\\s+", " ").trim();

        return s;
    }
    
    static String getName(String s){
        String[] ss = s.replaceAll("\\s+", " ").split(" ");
        return ss[ss.length-1].toLowerCase();
    }
    
    static String makeEmail(String s, int n){
        String[] arr = s.split(" ");
        String ten = arr[arr.length-1].toLowerCase();
        String hodem = "";
        for(int i=0;i<arr.length-1;i++){
            hodem += arr[i].toLowerCase().substring(0,1);           
        }
        if(n==1)
            return ten + hodem;
        else
            return ten + hodem + n;
        
    }
}
