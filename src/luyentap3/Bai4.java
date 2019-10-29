/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap3;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author manhvd
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        
        int sum = 0;
        int flag = 0;
        HashMap<Integer,Integer> map = new HashMap <>();
        map.put(0, 1);
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (map.containsKey(sum - k)){
                    flag = 1;
                    break;
                }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
