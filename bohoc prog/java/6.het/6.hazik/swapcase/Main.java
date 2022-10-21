class Main{

    public static void main(String[] args){
        String s = "Szia Nóri";
        System.out.println(swapcase(s));

    }

    public static String swapcase(String s) {
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
    }
}