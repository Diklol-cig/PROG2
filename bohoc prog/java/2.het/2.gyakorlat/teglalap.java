import java.util.Scanner;;

public class teglalap {
    
    static int kerulet(int a, int b)
    {
        return 2*a + 2*b;
    }

    static int terulet(int a, int b)
    {
        return a * b;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = 4;
        
        int k = kerulet(a,b);
        int t = terulet(a,b);
        System.out.println("Kerule #" + k);
        System.out.println("Terule #" + t);
        scanner.close();
    }

}
