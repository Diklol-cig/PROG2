import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        assert x%2==1 : "Parost irj";

        for (int i = 0; i < x; i++) 
        {
            for(int j = 0; j < x-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print(" *");
            }
            System.out.println("");
        }

        for(int i = x-2; i>=0; i--){
            for(int j = 0; j < x-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.println("Gyemant");
    }
}