import java.util.Objects;

public class Generalist extends Doctor{
    private int nrPacienti;

    public Generalist(int nrPacienti) {
        this.nrPacienti = nrPacienti;
    }

    public Generalist(String nume, int nrPacienti) {
        super(nume);
        this.nrPacienti = nrPacienti;
    }

    public Generalist() {

    }

    public int getNrPacienti() {
        return nrPacienti;
    }

    public void setNrPacienti(int nrPacienti) {
        this.nrPacienti = nrPacienti;
    }

    public void prescrieRetete() {
        System.out.println(this.getNume() + " prescrie retete.");
    }

    @Override
    public String toString() {
        return this.getNume() + " are " + nrPacienti + " pacienti";
    }

    public int compareTo(Generalist gen) {
        return this.nrPacienti - gen.nrPacienti;
    }

}
