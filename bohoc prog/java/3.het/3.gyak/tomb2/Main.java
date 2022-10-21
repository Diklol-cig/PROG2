import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] t1 = {1,2,3};
        int[] t2 = {1,2,3};

        System.out.println(Arrays.equals(t1, t2));
        Myutils.reverse(t1);
        System.out.println(Arrays.toString(t1));
        
    }
}
