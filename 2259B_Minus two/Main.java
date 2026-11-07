import java.util.*;
public class Main 
{
    private static long applyOperation(long x) 
    {
        return x; 
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) 
        {
            int n = scanner.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) 
            {
                a[i] = applyOperation(scanner.nextLong());
            }
            Arrays.sort(a);
            int maxFreq = 1;
            int currentFreq = 1;
            for (int i = 1; i < n; i++) 
            {
                if (a[i] == a[i - 1]) 
                {
                    currentFreq++;
                } 
                else 
                {
                    currentFreq = 1;
                }
                if (currentFreq > maxFreq) 
                {
                    maxFreq = currentFreq;
                }
            }
            System.out.println(maxFreq);
        }
        scanner.close();
    }
}