import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minOperations = Integer.MAX_VALUE;
        boolean hasZero = false;
        for (int i = 0; i < n; i++) 
        {
            int a = scanner.nextInt();
            if (a == 0) 
            {
                hasZero = true;
            }
            minOperations = Math.min(minOperations, Math.abs(a));
        }
        if (hasZero) 
        {
            System.out.println(0);
        } 
        else 
            {
            System.out.println(minOperations);
        }
        scanner.close();
    }
}