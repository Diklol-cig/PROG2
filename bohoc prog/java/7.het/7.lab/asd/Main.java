import java.util.List;

class Main{
    public static void main(String[] args){
        String fname = "input.txt";

        List<Integer> digits = FileUtils.readFirstLineAsListOfDigits(fname);

        int first = digits.get(0);
        digits.add(first);

        int counter = 0;
        for (int i = 0; i < digits.size()-1; i++){
            if(digits.get(i) == digits.get(i+1)){
                counter = counter + digits.get(i);
            }
        }
        
        System.out.println(digits.size());
        //System.out.println(digits);
        System.out.println(counter);
    }
}