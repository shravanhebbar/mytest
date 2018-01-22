

    import java.io.*;
    import java.util.*;
    import java.math.*;
    import java.util.concurrent.*;
    public final class hasmaphack
    {
        static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	static FastScanner sc=new FastScanner(br);
        static PrintWriter out=new PrintWriter(System.out);
    	static Random rnd=new Random();
    	static int maxn=(int)(1e6+5);
    	
        public static void main(String args[]) throws Exception
        {
    		int m=sc.nextInt(),q=sc.nextInt(),n=sc.nextInt();int[] a=new int[n];
    		
    		int[] cnt=new int[maxn];
    		
    		if(m<1 || m>100 || q<1 || q>10 || n<1 || n>1000000)
    		{
    			throw new Exception("Wrong");
    		}
    		
    		for(int i=0;i<n;i++)
    		{
    			a[i]=sc.nextInt();
    			
    			if(a[i]<1 || a[i]>1000000)
    			{
    				throw new Exception("Wrong");
    			}
    			
    			cnt[a[i]]++;
    		}
    		
    		int max=0;
    		
    		for(int i=1;i<maxn;i++)
    		{
    			int curr=i,now=0,val=q;
    			
    			while(curr>=1 && val>=0)
    			{
    				now=now+cnt[curr];
    				
    				curr-=m;val--;
    			}
    			
    			curr=i;val=q;
    			
    			while(curr<maxn && val>=0)
    			{
    				now=now+cnt[curr];
    				
    				curr+=m;val--;
    			}
    			
    			max=Math.max(max,now-cnt[i]);
    		}
    		
    		out.println(max);out.close();
        }
    }
    class FastScanner
    {
        BufferedReader in;
        StringTokenizer st;
        public FastScanner(BufferedReader in) {
            this.in = in;
        }
    	
        public String nextToken() throws Exception {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(in.readLine());
            }
            return st.nextToken();
        }
    	
    	public String next() throws Exception {
    		return nextToken().toString();
    	}
    	
        public int nextInt() throws Exception {
            return Integer.parseInt(nextToken());
        }
        public long nextLong() throws Exception {
            return Long.parseLong(nextToken());
        }
        public double nextDouble() throws Exception {
            return Double.parseDouble(nextToken());
        }
    }


			