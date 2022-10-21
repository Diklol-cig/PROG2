class Main{
    public static void main(String[] args){
        double d = 20;
        int n = (int)d;

        float f = 3.14;

        double dd = f;

        //Primitiv -> String

        //a
        int i = 2;
        String s = "" + i;

        //b
/*      String.valueOf('a');
        String.valueOf('42');
        String.valueOf('3.14');
*/
        //c
        //Integer.toString(56);
    
        
        
        //String -> Primitív

        //Integer.parseInt(s)   -> int  //Primitív típust ad vissza

        //Integer.valueOf      -> int //Nem primitív típust ad vissza

        //int y = Integer.valueOf("17");
        //Auto unboxing


        Long.parseLong("123");
        Float.parseFloat("3.14");
        Double.parseDouble("7.99");
        String s1 = "a";
        s1.charAt(0);
}