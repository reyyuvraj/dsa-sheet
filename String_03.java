import java.util.*;
public class String_03
{
	public static void main(String[] args)
	{
		try(Scanner in = new Scanner(System.in))
        {
		String s = in.next();
		int i=0,len=s.length();
		char c[] = new char[len];
		int r[] = new int[26];
		for(i=0;i<len;i++)
			c[i]=s.charAt(i);
		for(i=0;i<len;i++)
			r[s.charAt(i)-97]++;
		for(i=0;i<26;i++)
			if(r[i]>1)
				System.out.println((char)(i+97)+", count = "+ r[i]);
        }
	}
}