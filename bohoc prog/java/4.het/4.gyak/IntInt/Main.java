import java.util.ArrayList;
import java.util.List;


class Main{
    public static void main(String[] args){
        int[] szamok = {1,2,3,4,5,6,7,9};

        List<Integer> result = getFirstAndLast(szamok);

        System.out.println(result);
    }

    public static List<Integer> getFirstAndLast(int[] szamok){
        List<Integer> pair = new ArrayList<Integer>();
        pair.add(szamok[0]);
        pair.add(szamok[szamok.length - 1]);
        
        return pair;

    }
}