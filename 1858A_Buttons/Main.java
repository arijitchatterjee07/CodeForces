import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) 
        {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long annaTurns = a + (c + 1) / 2;
            long katieTurns = b + c / 2;
            
            if (annaTurns > katieTurns) 
            {
                System.out.println("First");
            } 
            else 
            {
                System.out.println("Second");
            }
        }
        scanner.close();
    }
}