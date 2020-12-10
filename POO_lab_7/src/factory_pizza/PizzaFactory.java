package factory_pizza;

public class PizzaFactory {
    public enum TipPizza{
        DIAVOLA, HAWAII, PEPPERONI
    }

    public Pizza creeazaPizza(TipPizza pizza, int dimensiune, int pret) {
        switch (pizza) {
            case DIAVOLA -> {
                return new DiavolaPizza(dimensiune, pret);
            }
            case HAWAII -> {
                return new HawaiiPizza(dimensiune, pret);
            }
            case PEPPERONI -> {
                return new PepperoniPizza(dimensiune, pret);
            }
        }
        throw new IllegalArgumentException("Tipul de pizza " + pizza + " nu este cunoscut");
    }
}