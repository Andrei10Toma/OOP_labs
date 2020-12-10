package factory_pizza;

public class DiavolaPizza extends Pizza{
    public DiavolaPizza(int dimensiune, int pret) {
        super(dimensiune, pret);
    }

    @Override
    public String toString() {
        return "Diavola " + super.dimensiune + " " + super.pret;
    }
}
