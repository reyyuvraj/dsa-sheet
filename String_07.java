public class String_07 
{
    public String countAndSay(int n) 
    {
        String s="1";
        for(int i=2;i<=n;i++)
        {
            StringBuilder sb=new StringBuilder();
            int count=1;
            for(int j=1;j<=s.length();j++)
            {
                if(j<s.length() && s.charAt(j)==s.charAt(j-1))
                {
                    count++;
                } else {
                    sb.append(count);
                    count=1;
                    sb.append(s.charAt(j-1));
                }
            }
            s=sb.toString();
        }
        return s;
    }
}