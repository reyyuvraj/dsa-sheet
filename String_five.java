import java.util.*;
public class String_five 
{
	public static void main(String[] args)
	{
		try(Scanner in = new Scanner(System.in))
		{
			String s = in.next();
			String st= in.next();
			String str = s.concat(s);
			if (str.contains(st) && s.length()==st.length())
	            System.out.println("Strings are rotations of each other");
	        else
	            System.out.printf("Strings are not rotations of each other");
		}
	}
}