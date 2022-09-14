import java.util.Scanner;
public class Beolvas{
static String input(String prompt){
    Scanner scanner = new Scanner(System.in);
    System.out.print(prompt);
    String name = scanner.nextLine();
    scanner.close();
    return name;
}


    public static void main(String[] args){
        
        String prompt = "Mi a neved kutya: ";

        System.out.print("Mi a neved kutya: ");
        String name = input(prompt);
        System.out.println("Szia" + name);
        
    }
}

