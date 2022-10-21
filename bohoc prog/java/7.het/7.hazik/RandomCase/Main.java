class Main{
    public static void main(String[] args){
        String s = PyUtils.input("Neved: ");
        System.out.println("Eredeti szoveg: " + s);


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <s.length(); i++) {
            if (Math.random() >= 0.5) {
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        System.out.println(sb.toString());
        
    }
}