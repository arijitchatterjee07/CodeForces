import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) 
        {
            int n = scanner.nextInt();
            if (n % 3 == 0) 
            {
                System.out.println("Second");
            } 
            else 
            {
                System.out.println("First");
            }
        }
        scanner.close();
    }
}