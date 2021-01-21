package aplicatii_2;

public class ProdusAlimentar extends Produs {
    private double pretProducator;

    public ProdusAlimentar(double pretProducator) {
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
        return pretProducator + 0.2 * pretProducator;
    }

    @Override
    public void afiseaza() {
        System.out.println("Produs Alimentar: " + pretProducator + " " + pretRaft());
    }
}
