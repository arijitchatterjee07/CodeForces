import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) 
            {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            if (n >= k * k && (n % 2) == (k % 2)) 
            {
                System.out.println("YES");
            } 
            else 
            {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}