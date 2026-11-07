import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long k=Math.min(a-b,b);
            if (k > 0)
            {
                System.out.println(k);
            }
            else
            {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}