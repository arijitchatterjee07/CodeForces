import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean f = false;
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) 
            {
            if (s.charAt(i) == s.charAt(i + 1)) 
            {
                count++;
            } 
            else 
            {
                count = 1;
            }
            
            if (count >= 7) 
            {
                f = true;
                break;
            }
        }
        if (f) 
        {
            System.out.println("YES");
        } 
        else 
        {
            System.out.println("NO");
        }
        sc.close();
    }
}