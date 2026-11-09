import java.util.*;
public class VanyaAndLanterns 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long l = scanner.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = scanner.nextLong();
        }
        Arrays.sort(a);
        double maxDist = Math.max(a[0], l - a[n - 1]);
        for (int i = 0; i < n - 1; i++) 
        {
            double gap = (a[i + 1] - a[i]) / 2.0;
            if (gap > maxDist) 
            {
                maxDist = gap;
            }
        }
        System.out.printf("%.10f\n", maxDist);
        scanner.close();
    }
}