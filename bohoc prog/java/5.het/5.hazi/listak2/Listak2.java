import java.util.List;

import javax.lang.model.util.ElementScanner14;

import java.util.ArrayList;
import java.util.Collections;

class Listak2
{
    // D.
    // Bemenet: számok rendezett listája.
    // Kimenet: a bemenetből távolítsuk el az ismétlődéseket, vagyis az
    // eredményben egy szám csak egyszer szerepeljen.
    // Példa: [1, 2, 2, 3] -> [1, 2, 3].
    private static List<Integer> removeAdjacent(List<Integer> nums)
    {
        List<Integer> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>(nums);
        for (int i = 1; i < nums.size(); i++){
            if(nums.get(i) == nums.get(i-1)){
                tmp.remove(nums.get(i));
            }
            else{
                result.add(nums.get(i));
            }
        }
        return tmp;
    }

    // E.
    // Bemenet: két lista, mindkettőben az elemek növekvő sorrendbe rendezve.
    // Kimenet: egy összefésült lista, melyben az elemek rendezve szerepelnek.
    private static List<String> listMerge(List<String> li1, List<String> li2)
    {
        List <String> l1 = new ArrayList<String>(li1);
        l1.addAll(li2);

        Collections.sort(l1);
        
        return l1;
    }

    // Egy egyszerű teszt fv. Kiírja az egyes fv.-ek visszaadott értékét, ill.
    // azt is, hogy mit kellett volna visszaadniuk.
    private static <T> void test(List<T> got, List<T> expected)
    {
        String prefix = (got.equals(expected)) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    // Ezt ne módosítsuk.
    // A main() fv. meghívja a fenti fv.-eket különféle paraméterekkel,
    // s a test() fv. segítségével megnézi, hogy az eredmények helyesek-e.
    public static void main(String[] args)
    {
        System.out.println("remove_adjacent");
        test(removeAdjacent(List.of(1, 2, 2, 3)), List.of(1, 2, 3));
        test(removeAdjacent(List.of(2, 2, 3, 3, 3)), List.of(2, 3));
        test(removeAdjacent(List.of()), List.of());

        System.out.println();
        System.out.println("list_merge");
        test(listMerge(List.of("aa", "xx", "zz"), List.of("bb", "cc")),
            List.of("aa", "bb", "cc", "xx", "zz"));
        test(listMerge(List.of("aa", "xx"), List.of("bb", "cc", "zz")),
            List.of("aa", "bb", "cc", "xx", "zz"));
        test(listMerge(List.of("aa", "aa"), List.of("aa", "bb", "bb")),
            List.of("aa", "aa", "aa", "bb", "bb"));
    }
}
