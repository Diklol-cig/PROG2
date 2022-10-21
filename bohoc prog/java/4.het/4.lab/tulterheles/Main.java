class Proba{
    public int add(int a, int b){
        System.out.println("#1 v1, int");
        return a + b;
    }
    public double add(double a, double b){
        System.out.println("#2 v2, double");
        return a + b;
    }
//Ugyan az a nev, mas visszateressel
}

public class Main {
    public static void main(String[] args) {
        Proba p = new Proba();
        System.out.println(p.add(1, 2));
        System.out.println(p.add(1.1, 2.2));
    }
}