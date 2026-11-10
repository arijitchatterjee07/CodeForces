import java.util.*;
public class Solution 
{
    public static void main(String[] args)  
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String result = "";
        String vowels = "aoyeuiAOYEUI";
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) == -1) 
            {
                result += '.';
                if (ch >= 'A' && ch <= 'Z') 
                {
                    ch = (char) (ch + 32);
                }
                result += ch;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}