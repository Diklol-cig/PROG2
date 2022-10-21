class Main{
    public static void main(String[] args){
        String asd = "Hello, world!";
        StringBuilder sb = new StringBuilder();
        sb.append(asd);
        sb.reverse();
        System.out.println(sb.toString());

        //HF StringUtils  ----> StringUtils.strrev("Hello, world!");  --!dlrow ,olleH

        //String strrev(Strings ) { ... }

        //HF StringUtils ----> StringUtils.isPalindrome("rapipar") --> True
        //HF StringUtils ----> StringUtils.isPalindrome("rapiparasd") --> False

    }
}