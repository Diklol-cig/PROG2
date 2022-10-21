import java.util.Arrays;

class Main{
    public static void main(String[] args){
        if (args.length == 2){
        
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            System.out.println(n1+n2);
        }
        else{
            System.out.println("Pontosan ket szamot kell megadni");
            System.exit(1);
        }
    }
}