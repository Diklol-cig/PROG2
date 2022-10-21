class Main{

    public static void main(String[] args){
    
        Teglalap t = new Teglalap(10.1, 10.2);
        Teglalap t2 = new Teglalap(2* t.getA(),2* t.getB());

        System.out.println("Terulet: "  + t.terulet() + "\nKerulet: " + t.kerulet());
        System.out.println(t);
        System.out.println(t2);

    }
}