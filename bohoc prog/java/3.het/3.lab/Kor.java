public class Kor {
    private double r;

    public Kor(double r) {
        this.r = r;
    }

    public double terulet() {
        return Math.PI * Math.pow(r, 2);
    }

    public boolean isSmallerThan(Kor other) {
        return this.r < other.r;
    }
}
