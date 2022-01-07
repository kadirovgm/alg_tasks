
public class balanced_java_1
{
    public static boolean checkBalancedBrackets (String s)
    {   
        int c = 0;
        for (int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
                c++;
            else c--;

            if(c<0)
            return false;
        }
        if (c==0)
            return true;
        return false;
    }

    public static void main (String[] args)
    {
        String s = "[(([)])]";
        System.out.println(checkBalancedBrackets(s));
    }

} 