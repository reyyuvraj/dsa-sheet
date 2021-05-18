
//reverse a string
//https://practice.geeksforgeeks.org/problems/palindrome-string0817/1

public class String_01
{
	  public void helper(char[] s, int left, int right) 
	  {
	    if (left >= right) return;
	    char tmp = s[left];
	    s[left++] = s[right];
	    s[right--] = tmp;
	    helper(s, left, right);
	  }
	  public void reverseString(char[] s) 
	  {
	    helper(s, 0, s.length - 1);
	  }
} 