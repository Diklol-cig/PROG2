import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args){
        //v = Verem()      # üres verem létrehozása

        Verem v = new Verem();   

        v.betesz(1);
        v.betesz(2);
        v.betesz(56);
        
        /* Verem uj = new Verem(); 
        uj.kivesz(); */
        System.out.println(v.meret());
        System.out.println(v);

        v.kivesz();

        System.out.println(v);
    }
}

class Verem{
    private List<Integer> data;

    public Verem() {
        this.data= new ArrayList<>();
    }

    public void betesz(int n) {
        this.data.add(n);
    }

    public int meret(){
        return this.data.size();
    }

    public boolean üres(){
        return this.meret() == 0;
    }

    public void kivesz(){
        this.data.remove(this.data.size()-1);
    }
    @Override
    public String toString(){
        return "Verem(" + this.data.toString().replace("]", "").replace("[", "") + ")";
    }

}
