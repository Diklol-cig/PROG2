
public class Teglalap {
    private double a;
    private double b;

    public Teglalap(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString(){

        return String.format("a: %f, b: %f", a, b);
    }

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double terulet() {
        return a*b;
    }

    public double kerulet(){
        return 2*a + 2*b;
    }
}
