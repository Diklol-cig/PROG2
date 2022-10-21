import java.util.Arrays;

class Main{
    public static void main(String[] args)
    {
        final int tomb[] = {0,1,2,3,4,5,6,7};

        //int masolat[] = tomb.clone();

        tomb[0] = 99;

        for (int e : tomb)
        {
            System.out.println(e);
        }


        int[] result = getMinMax(tomb);
        System.out.println(Arrays.toString(result));
    }


    public static int[] getMinMax (int[] tomb)
    {
        int minimax[] = new int[2];
        Arrays.sort(tomb);
        minimax[0] = tomb[0];
        minimax[1] = tomb[1];
        return minimax;
    }

}
   /*  public static PairIntInt getMinMax2 (int[] tomb)
    {

    } */

    
