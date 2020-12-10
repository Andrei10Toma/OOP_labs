package factory_pizza;

public abstract class Pizza {
    int dimensiune;
    int pret;
    protected Pizza(int dimensiune, int pret) {
        this.dimensiune = dimensiune;
        this.pret = pret;
    }
}
