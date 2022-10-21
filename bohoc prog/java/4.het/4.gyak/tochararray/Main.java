import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main{
    public static void main(String[] args){
        List<Integer> erdeti = new ArrayList<Integer>();  //new ArrayList<>(); ---> Így is jó;
        erdeti.add(3);
        erdeti.add(4);
        erdeti.add(5);
        erdeti.add(6);

        List<Integer> masolat = new ArrayList<Integer>(erdeti);
        erdeti.set(0, 99);
        
        System.out.println(erdeti);
        System.out.println(masolat);

        Collections.rotate(masolat,1);
        System.out.println(masolat);

        Collections.shuffle(masolat);
        System.out.println(masolat);
    }
}
