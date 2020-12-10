package factory_pizza;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza(int dimensiune, int pret) {
        super(dimensiune, pret);
    }
    @Override
    public String toString() {
        return "Pepperoni " + super.dimensiune + " " + super.pret;
    }
}
