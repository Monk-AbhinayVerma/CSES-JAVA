package cses;

import java.util.Scanner;

public class IncreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		long moves =0;
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				moves += arr[i-1]-arr[i];
				arr[i] = arr[i-1];
			}
		}
		System.out.println(moves);
		sc.close();
	}

}
