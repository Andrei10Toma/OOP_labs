package factory_pizza;

public class HawaiiPizza extends Pizza {
    public HawaiiPizza(int dimensiune, int pret) {
        super(dimensiune, pret);
    }

    @Override
    public String toString() {
        return "Hawaii " + super.dimensiune + " " + super.pret;
    }
}
