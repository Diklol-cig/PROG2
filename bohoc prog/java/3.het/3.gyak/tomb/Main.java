import java.util.Arrays;

public class Main{
    static void kiir(int[] tomb){
        for(int i = 0; i < tomb.length; i++){
            System.out.println(tomb[i]);
        }
    }

    public static int[] getOneToFive()
    {
        int[] result = {1, 2, 3, 4, 5};
        return result;
    }
    
    public static void main(String[] args){
        int[] scores = new int[5]; // Ki lesz 0llázva

        
        /*for(int i = 0; i < scores.length; i++){
            scores[i] = i*10;
            System.out.println(scores[i]);
        } */

        int[] tomb = {3,1,1,3,4};

        kiir(tomb);
        int[] five = getOneToFive();
        System.out.println(Arrays.toString(five));;
    }
}