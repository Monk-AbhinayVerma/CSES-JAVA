package cses;

import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if(n==2 || n==3) {
			System.out.println("NO SOLUTION");
			return;
		}
		StringBuilder e = new StringBuilder();
		StringBuilder o = new StringBuilder();
		for(long i=2;i<=n;i+=2) {
			e.append(i+" ");
		}
		for(long i=1;i<=n;i+=2) {
			o.append(i+" ");
		}
		System.out.print(e);
		System.out.print(o);
		sc.close();
	}

}
