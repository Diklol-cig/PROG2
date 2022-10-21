import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kerem az elsot: ");
        String s1 = scanner.nextLine();
        int n1 = Integer.parseInt(s1);
        System.out.print("Kerem a masodikat: ");
        String s2 = scanner.nextLine();
        int n2 = Integer.parseInt(s2);
        
        int n3 = n1+n2;
        System.out.println(n3);

    }
}