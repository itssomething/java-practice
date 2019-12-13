/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author manhvd
 */
public class Bai18 {
    static Stack<Integer> stack = new Stack<>();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true){
            String s = in.nextLine();
            String[] ss = s.split(" ");            

            if(!s.equals("show") && !s.equals("pop")){
                exec(ss[0], Integer.parseInt(ss[1]));
            }else if(s.equals("show"))
                print();
            else
                stack.pop();
            
        }
    }
    
    static void exec(String s, int k){
        switch(s){
            case "push":
                stack.push(k);
                break;
            case "pop":
                stack.pop();
                break;
            case "show":
                print();
                break;
        }
    }
    static void print(){
        Object[] values = stack.toArray();
        for(Object obj : values){
            System.out.print(obj + " ");
        }
    }
}
