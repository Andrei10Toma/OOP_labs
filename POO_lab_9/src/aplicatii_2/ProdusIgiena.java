package aplicatii_2;

public class ProdusIgiena extends Produs {
    private double pretProducator;

    public ProdusIgiena(double pretProducator) {
        this.pretProducator = pretProducator;
    }

    public double getPretProducator() {
        return pretProducator;
    }

    public void setPretProducator(double pretProducator) {
        this.pretProducator = pretProducator;
    }

    @Override
    public double pretRaft() {
        return pretProducator + 0.1 * pretProducator;
    }

    @Override
    public void afiseaza() {
        System.out.println("Produs Igiena: " + pretProducator + " " + pretRaft());
    }
}
