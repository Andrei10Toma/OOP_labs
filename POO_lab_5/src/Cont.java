public class Cont {
    private int numarCont;
    private int depozit;

    public Cont(int numarCont, int depozit) {
        this.numarCont = numarCont;
        this.depozit = depozit;
    }

    public void depune(int suma) {
        depozit += suma;
    }

    public void retrage(int suma) throws ExceptieFonduriIsuficiente{
        if (suma > depozit) {
            throw new ExceptieFonduriIsuficiente("Fonduri insuficiente");
        }
        else {
            depozit -= suma;
        }
    }

    public int getNumarCont() {
        return numarCont;
    }

    public int getDepozit() {
        return depozit;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "numarCont=" + numarCont +
                ", depozit=" + depozit +
                '}';
    }
}
