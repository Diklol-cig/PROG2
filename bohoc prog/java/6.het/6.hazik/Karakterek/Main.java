class Main{
    public static void main(String[] args){
        /* char c = '5';
        System.out.println(Character.getNumericValue(c)); */

        String s = "90146852";
        System.out.println(Utils.sumOfDigits(s));
    }


    /* public static int sumOfDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    } */
}