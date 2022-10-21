import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<Integer>();
        
        numbers =PyUtils.range(3, 2, 9);
        System.out.println(numbers);
    }
}
