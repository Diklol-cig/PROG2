import java.util.ArrayList;
import java.util.List;


public class Main
    {
        public static void main(String[] args) {
            int a = 29;
            String as = Integer.toHexString(a);
            System.out.println("A toHexString a neki átadott int hexadecimális értkét adja vissza String formátumban");
            System.out.printf("Eredeti szám: %d \nHex alakja: %s\n", a, as);
            vonal();
    
            int b = 72;
            String bs = Integer.toBinaryString(b);
            System.out.println("A toBinaryString a neki átadott int bináris értkét adja vissza String formátumban");
            System.out.printf("Eredeti szám: %d \nBin alakja: %s\n",b,bs);
            vonal();
    
            double c = 3.14;
            int cs = Double.hashCode(c);
            System.out.println("A HashCode nevű függvény visszaidja int típusban a megadott double hash kódját");
            System.out.printf("A szám: %fl \nHash kódja: %d\n",c,cs);
            vonal();
    
            double d = 7.89;
            double d2 = 7.93;
            int ds = Double.compare(d, d2);
            System.out.println("A compare függvény 2 double értékét hasonlítja össze, ha az első megadott double a nagyobb, akkor pozitív, ha második, akkor negatív, ha pedig egyenlő, akkor 0 éertékkel tér vissza");
            System.out.printf("Első szám: %fl \nMásodik szám: %fl \nCompare: %d\n", d, d2, ds);
            vonal();
    
            boolean e = true;
            boolean e2 = false;
            boolean es = Boolean.logicalAnd(e, e2);
            System.out.println("A logicalAnd függvény a logikában ismert andhez hasonlóan múködik");
            System.out.printf("Első bool: %b \nMásodik bool: %b\nAnd: %b\n", e, e2, es);
            vonal();
    
            boolean f = true;
            boolean f2 = true;
            boolean fs = Boolean.logicalXor(f, f2);
            System.out.println("A logicalXor függvény a logikában ismert xorhoz hasonlóan múködik");
            System.out.printf("Első bool: %b \nMásodik bool: %b\nXor: %b\n", f, f2, fs);
            vonal();
    
            char g = 'F';
            char g2 = '5';
            boolean gs = Character.isLetter(g);
            boolean g2s = Character.isLetter(g2);
            System.out.println("Az isLetter függvény egy boolt ad vissza, ami megmondja, hogy betű-e az adott char");
            System.out.printf("Első char: %c Betű? : %b \nMásodik char: %c Betű? : %b\n", g, gs, g2, g2s);
            vonal();
    
            char h = 'F';
            char h2 = '5';
            boolean hs = Character.isDigit(h);
            boolean h2s = Character.isDigit(h2);
            System.out.println("Az isDigit függvény egy boolt ad vissza, ami megmondja, hogy szám-e az adott char");
            System.out.printf("Első char: %c Szám? : %b \nMásodik char: %c Szám? : %b\n", h, hs, h2, h2s);
            vonal();
        }
    
        public static void vonal(){
            for (int i = 0; i < 50; i++){
                System.out.printf("*");
            }
            System.out.println();
        }
}
