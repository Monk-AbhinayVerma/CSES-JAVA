package cses;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n-1];
		for(int i=0;i<n-1;i++) {
			arr[i] = sc.nextInt();
		}
		int freq[] = new int[n+1];
		for(int x: arr) {
			freq[x]++;
		}
		for(int i=1;i<=n;i++) {
			if(freq[i]==0) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}

}
