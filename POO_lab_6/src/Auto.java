import java.io.BufferedReader;
import java.io.IOException;
import java.util.Objects;

public class Auto {
    private String model;
    private int an;
    private int km;
    private double pret;

    public Auto(String model, int an, int km, double pret) {
        this.model = model;
        this.an = an;
        this.km = km;
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public int getAn() {
        return an;
    }

    public int getKm() {
        return km;
    }

    public double getPret() {
        return pret;
    }

    public static Auto citeste(BufferedReader br) throws IOException {
        String marca = br.readLine();
        if (marca == null) {
            return null;
        }
        return new Auto(marca,
                Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()),
                Double.parseDouble(br.readLine()));
    }

    @Override
    public boolean equals(Object o) {
        Auto a = (Auto) o;
        if (a.an == this.an && a.model.equals(this.model) && a.km == this.km && a.pret == this.pret) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", an=" + an +
                ", km=" + km +
                ", pret=" + pret +
                '}';
    }
}
