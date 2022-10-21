public class Main{

    public static void toClean(String t)
    {
        t.replaceAll("\\s","");
    }
    
    public static void main(String[] args)
    {
        String s1 = new String("192.20.246.138:\n 6666");
        String s2 = new String("206.130.99.82:\n8080");

        String st;
        st = s1.replaceAll("\\s","");

        System.out.println(st);
    
       /*  s2.replaceAll("\\","");

        System.out.println(s2); */
    }
}