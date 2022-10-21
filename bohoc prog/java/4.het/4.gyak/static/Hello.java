class Hello{
    public static void main(String[] args){
        

        Hello h = new Hello();
        h.start();
    }

    public void start(){            //Így már nem kell static
        System.out.println(duplaz(5));
    }

    public int duplaz(int i){  //Kell static mert nincs peldanyostiva, kiveve ha mar ott a start ami peldanyositott
        return 2*i;
    }
}