import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean f = true;
        long t = n;
        int count = 0;
        while (t > 0) 
        {
            long d = t % 10;
            if (d == 4 || d == 7)
            {
                count++;
            }
            t /= 10;
        }   
        if (count == 0)
        {
            f = false;
        }
        long temp = count;
        while (temp > 0)
        {
            long d = temp % 10;
            if (d != 4 && d != 7)
            {
                f = false;
                break;
            }
            temp /= 10;
        }
        if (f == true) 
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