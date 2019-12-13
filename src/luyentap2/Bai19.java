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
public class Bai19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        int tt = Integer.parseInt(t);
        
        while(tt-- > 0){
            String result = "";
            String s = in.nextLine();
            String[] a = s.split("");
            
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                
                if(Character.isLetterOrDigit(c))
                    result += c;
                else if(c == '(')
                    stack.push('(');
                else if(c == ')'){
                    while(!stack.isEmpty() && stack.peek() != '('){
                        result += stack.pop();                        
                    }
                    stack.pop();
                }
                else{
                    while(!stack.isEmpty() && pre(c) < pre(stack.peek())){
                        result += stack.pop();
                    }
                    stack.push(c);
                }
            }
            System.out.println(result);
        }
    }
    
    static int pre(Character s){
        switch(s){
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
                return 1;
        }
        return -1;
    }
}
