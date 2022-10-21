class Main{
    
    /* 
    Írjuk le egymás mellé a szamokat 1-20 és az eredmeny egy string legyen

    "123...8910...1920"
     */

    public final static int N = 100000;
    public static void main(String[] args){
        //Naiv verzio

        String s = "";
        for (int i = 1; i <= N; i++){
            //s += String.valueOf(i);           //s = "1234" + "5";  -> Garbage kollektor tul sokat dolgozik
            s = s + String.valueOf(i);

        }
        System.out.println(s.length());
    }
}