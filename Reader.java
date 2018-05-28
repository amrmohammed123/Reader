public static class Reader
{
	BufferedReader br;
	StringTokenizer st;
	public Reader()
	{
		br = new BufferedReader(new InputStreamReader(System.in));    		
	}
	public String next()
	{
		try
		{
			if(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
			System.exit(1);
		}    		
		return st.nextToken();
	}
	public int nextInt()
	{
		return Integer.parseInt(next());
	}
	public double nextDouble()
	{
		return Double.parseDouble(next());
	}
	public long nextLong()
	{
		return Long.parseLong(next());
	}
	public String nextLine()
	{
		try
		{
			return br.readLine();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
			System.exit(1);
		}
		return "";
	}
}