import java.util.Scanner;

public class PyUtils {
    
    //public PyUtils() {}

    public static String input(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(str);
        String out = scanner.nextLine();

        return out;
    }
}
