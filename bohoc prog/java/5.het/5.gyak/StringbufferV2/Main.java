class Main{
    
    public final static int N = 100000;
    public static void main(String[] args){
        //Stringbufferes megoldas

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++)
        {
            sb.append(String.valueOf(i));
        }
        System.out.println(sb.toString().length());
    }

}