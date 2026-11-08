import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int steps=0;
        steps+=n/5;
        n%=5;
        steps+=n/4;
        n%=4;
        steps+=n/3;
        n%=3;
        steps+=n/2;
        n%=2;
        steps+=n/1;
        n%=1;
        System.out.println(steps);
        sc.close();
    }
}