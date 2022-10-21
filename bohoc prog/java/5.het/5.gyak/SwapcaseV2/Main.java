class Main{

    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("Pontosan 1 szo kell");
            

        }
        
        String s = "Szia Nóri";
        String result = StringUtils.swapCase(s);
        System.out.println(result);
    }

/*     public static String swapcase(String s) {
    String swap = "";

    char ch = 0;
    for(int i = 0; i < s.length(); i++){
        ch = s.charAt(i);
        
        if (Character.isUpperCase(ch)){
            ch=Character.toLowerCase(ch);
        }
        else if (Character.isLowerCase(ch)){
            ch=Character.toUpperCase(ch);
        }
        swap = swap + ch;

    }
    

    return swap;
    } */
}