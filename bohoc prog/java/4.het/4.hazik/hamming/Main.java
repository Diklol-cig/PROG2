class Main {
    static int hammingDist(String str1, String str2)
    {
        int i = 0, count = 0;
        while (i < str1.length()) {
            if (str1.charAt(i) != str2.charAt(i))
                count++;
            i++;
        }
        return count;
    }
 
    public static void main(String[] args)
    {
        String str1 = "roses";
        String str2 = "toned";
        System.out.println(hammingDist(str1, str2));
    }
}