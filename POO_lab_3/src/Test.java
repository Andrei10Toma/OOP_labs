public class Test {
    public static void main(String[] args) {
        Autogara gara = new Autogara(4);
        gara.afiseazaAutogara();
        System.out.println();
        System.out.println("Profitul total este " + gara.profitTotal() + ".");
        System.out.println();
        System.out.println("Autogara sortata dupa profit este: ");
        gara.sortare();
        gara.afiseazaAutogara();
    }
}
