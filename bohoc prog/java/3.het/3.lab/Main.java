public class Main {
    public static void main(String[] args) {
        Kor k1 = new Kor(10);
        System.out.println("A kör területe: " + k1.terulet());

        Kor k2 = new Kor(2.4);
        System.out.println("A kör területe: " + k2.terulet());

        if (k1.isSmallerThan(k2)){
            System.out.println("c2 is smaller than c3");
        }
        else{
            System.out.println("c2 is bigger than c3");
        }
    }
}
