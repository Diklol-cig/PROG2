import java.util.ArrayList;
import java.util.List;

public class PyUtils{
    
    private PyUtils(){
        //Ures
    }

    public static List<Integer> range(int hi){

        /* List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < hi; i++){
            result.add(i);
        } */
        return range(0,hi,1);
    }

    public static List<Integer> range(int low,int hi){

/*         List<Integer> result = new ArrayList<Integer>();
        for(int i = low; i < hi; i++){
            result.add(i);
        } */
        return range(low,hi,1);
    }

    public static List<Integer> range(int low,int hi,int step){

        List<Integer> result = new ArrayList<Integer>();
        for(int i = low; i < hi; i = i + step){
            result.add(i);
        }
        return result;
    }
}