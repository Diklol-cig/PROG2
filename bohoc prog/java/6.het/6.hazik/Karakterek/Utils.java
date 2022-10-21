public class Utils {
    
    
    public static int sumOfDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Character.getNumericValue(c);
    }
    return sum;
    }
}
