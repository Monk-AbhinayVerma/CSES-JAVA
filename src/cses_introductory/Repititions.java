package cses_introductory;

import java.util.Scanner;

public class Repititions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 1, maxi = 0;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i) == s.charAt(i-1)) {
				cnt++;
			}
			else {
				maxi = Math.max(maxi, cnt);
				cnt = 1;
			}
		}
		maxi = Math.max(maxi, cnt);
		System.out.println(maxi);
		sc.close();
	}

}
