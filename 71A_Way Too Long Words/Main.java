import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >= 0)
        {
            String s=sc.nextLine().trim();
            if (s.length() > 10)
            {
              int k=(s.substring(0,s.length()-2)).length();
              String w="";
              w+=s.charAt(0);
              w+=k;
              w+=s.charAt(s.length()-1);
              System.out.println(w);
            }
            else
            {
              System.out.println(s);
            }
        }
        sc.close();
    }
}