package cses_mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JosepusQueries {
	
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		int q = sc.nextInt();
		while(q-- > 0) {
			long n = sc.nextInt();
			long k = sc.nextInt();
			long res = solve(n,k);
			System.out.println(res);
		}
	}
	
	public static long solve(long n, long k) {
		if(n==1)return 1;
		if(k <= (n+1)/2) {
			if(2*k > n)return (2*k)%n;
			else return 2*k;
		}
		long temp = solve(n/2, k-((n+1)/2));
		if((n&1)!=0)return 2*temp+1;
		else return 2*temp - 1;
	}
}
