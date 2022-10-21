public class Myutils {
    
    
    public static int[] reverse(int[] t){
        for (int i=0; i<t.length; i++)
            {
                int j = t.length - i - 1;
                int temp = t[i];
                t[i] = t[j];
                t[j] = temp;
            }
            return t;
    }
}
