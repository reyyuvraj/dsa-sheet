// { Driver Code Starts
//Initial Template for Java

import java.io.*;

class two 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) 
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPlaindrome(S));
        }
    }
}


//User function Template for Java

class Solution 
{
    int isPlaindrome(String S) 
    {
        // code here
		String str ="";
		for(int i=S.length()-1;i>=0;i--)
			str = str + S.charAt(i);
		if(S.equals(str))
			return 1;
		else
			return 0;
    }
};