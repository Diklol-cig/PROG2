import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Listak1
{
    // A. match_ends
    // Bemenet: sztringek listája. Számoljuk meg, hogy a bemenetben
    // hány olyan sztring van, melynek a hossza legalább 2 s az
    // első karaktere egyezik az utolsó karakterével. A visszatérési
    // érték ezen feltételeket kielégítő sztringek száma legyen.
    private static int matchEnds(List<String> words)
    {
        int szam = 0;

        for (int i = 0; i < words.size(); i++){
            String tmp = words.get(i);
            if (tmp.length()>=2)
            {
                if (tmp.charAt(0) == tmp.charAt(tmp.length()-1))
                {
                    szam++;
                }
            }
        }
        
        return szam;
    }

    // B. front_x
    // Bemenet: sztringek listája. Egy olyan listával térjünk vissza,
    // melyben a szavak rendezve vannak, viszont az "x"-szel kezdődő szavak
    // kerüljenek előre.
    // Példa: ["mix", "xyz", "apple", "xanadu", "aardvark"] bemenet esetén
    // az eredmény: ["xanadu", "xyz", "aardvark", "apple", "mix"].
    // Tipp: használhatunk 2 listát is, melyeket külön-külön rendezünk, majd
    //       egyesítjük őket.
    private static List<String> frontX(List<String> words)
    {
        List <String> aux = new ArrayList<String>();
        List <String> szavak = new ArrayList<String>();
        String tmp;
                
        for (int i = 0; i < words.size(); i++){
            tmp = words.get(i);
            if (tmp.charAt(0) == 'x'){
                aux.add(tmp);
            }
            else{
                szavak.add(tmp);
            }
        }
        Collections.sort(aux);
        Collections.sort(szavak);

        List<String> newList = new ArrayList<String>(aux);
        newList.addAll(szavak);
        
        return newList;
    }

    // Egy egyszerű teszt fv. Kiírja az egyes fv.-ek visszaadott értékét, ill.
    // azt is, hogy mit kellett volna visszaadniuk.
    private static void test(int got, int expected)
    {
        String prefix = (got == expected) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    // Egy egyszerű teszt fv. Kiírja az egyes fv.-ek visszaadott értékét, ill.
    // azt is, hogy mit kellett volna visszaadniuk.
    private static void test(List<String> got, List<String> expected)
    {
        var prefix = (got.equals(expected)) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    // Ezt ne módosítsuk.
    // A main() fv. meghívja a fenti fv.-eket különféle paraméterekkel,
    // s a test() fv. segítségével megnézi, hogy az eredmények helyesek-e.
    public static void main(String[] args)
    {
        System.out.println("match_ends");
        test(matchEnds(List.of("aba", "xyz", "aa", "x", "bbb")), 3);
        test(matchEnds(List.of("", "x", "xy", "xyx", "xx")), 2);
        test(matchEnds(List.of("aaa", "be", "abc", "hello")), 1);

        System.out.println();
        System.out.println("front_x");
        test(frontX(List.of("bbb", "ccc", "axx", "xzz", "xaa")),
             List.of("xaa", "xzz", "axx", "bbb", "ccc"));
        test(frontX(List.of("ccc", "bbb", "aaa", "xcc", "xaa")),
             List.of("xaa", "xcc", "aaa", "bbb", "ccc"));
        test(frontX(List.of("mix", "xyz", "apple", "xanadu", "aardvark")),
             List.of("xanadu", "xyz", "aardvark", "apple", "mix"));
    }

}
