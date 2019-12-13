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
 * @author Manh
 */
public class Bai10 {
  static long N[], Q[];
  static int n;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    N = new long[n];
    
    for(int i=0;i<n;i++){
      N[i] = in.nextLong();
    }
    
    Arrays.sort(N);
    int q = in.nextInt();    
    
    for(int i=1;i<=q;i++){
      long k = in.nextLong();
      int res = binarySearch(0, n, k);
      if(res == -1)
        System.out.println("0");
      else
        System.out.println(res+1);
    }
  }
  
  static int binarySearch(int l, int r,long K){
	if(l > r) return -1;
	int mid = (l + r)/2;
	if((N[mid] <= K && N[mid + 1] > K) || (N[mid] <= K && mid + 1 == n) ) return mid;
	else if(N[mid] <= K) return binarySearch(mid + 1, r, K);
	else return binarySearch(l, mid -1, K);
}
}