public class Microbuz extends MijlocTransport{
    private int numarPasageri;
    private int pretBilet;

    public int incasare() {
        return numarPasageri * pretBilet;
    }

    public int profit() {
        return this.incasare() / 4;
    }

    public void afiseaza() {
        System.out.println("Microbuz (" + this.getCuloare() + ", " + this.isFuncional() +
                ") cu " + numarPasageri + " si " + pretBilet + ".");
    }

    public int getNumarPasageri() {
        return numarPasageri;
    }

    public void setNumarPasageri(int numarPasageri) {
        this.numarPasageri = numarPasageri;
    }

    public int getPretBilet() {
        return pretBilet;
    }

    public void setPretBilet(int pretBilet) {
        this.pretBilet = pretBilet;
    }

    public Microbuz(int numarPasageri, int pretBilet) {
        this.numarPasageri = numarPasageri;
        this.pretBilet = pretBilet;
    }

    public Microbuz(String culoare, boolean funcional, int numarPasageri, int pretBilet) {
        super(culoare, funcional);
        this.numarPasageri = numarPasageri;
        this.pretBilet = pretBilet;
    }

    public Microbuz() {
    }
}
