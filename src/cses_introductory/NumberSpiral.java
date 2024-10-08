package cses_introductory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class NumberSpiral {
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }  

	public static void main(String[] args) {
		// TODO Auto-generate method stub
		FastReader s = new FastReader();
        long n = s.nextLong();
        long a = 0;
        while(n-->0)
        {
	         long r = s.nextLong();
	         long c = s.nextLong();
	         if(r>c){
	        	 if(r%2==0)a=((r*r)-c)+1;
	        	 else a=((r-1)*(r-1)+c);
	         }else if(c>r){
	        	if(c%2==0)a=((c-1)*(c-1)+r);
	        	else a=((c*c)-r)+1;
	         }else a=((r*r)-r)+1;
	         System.out.println(a); 
        }
	}
}
