package factory_pizza;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pf = new PizzaFactory();
        Pizza pizzaDiavola = pf.creeazaPizza(PizzaFactory.TipPizza.DIAVOLA, 10, 20);
        Pizza pizzaPepperoni = pf.creeazaPizza(PizzaFactory.TipPizza.PEPPERONI, 15, 25);
        Pizza pizzaHawaii = pf.creeazaPizza(PizzaFactory.TipPizza.HAWAII, 30, 29);
        System.out.println(pizzaDiavola);
        System.out.println(pizzaPepperoni);
        System.out.println(pizzaHawaii);
    }
}
