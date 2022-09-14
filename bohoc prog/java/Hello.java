public class Hello
{
    public static void main(String[] args)
    {
        int N = 10;
        int total = 0;

        for (int i = 1; i < N; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                total += i;
            }
        }
        System.out.println(total);
    }
}