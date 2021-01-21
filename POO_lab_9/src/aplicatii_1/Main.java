package aplicatii_1;

public class Main {
    public static void main(String[] args) {
        Lista<Integer> integerLista = new Lista<>(3);
        Lista<Double> doubleLista = new Lista<>(3);
        Lista<String> stringLista = new Lista<>(3);

        System.out.println("Integer List");
        integerLista.adauga(1);
        integerLista.adauga(2);
        integerLista.adauga(3);
        integerLista.adauga(4);
        integerLista.adauga(5);
        integerLista.afiseaza();
        System.out.println(integerLista.cauta(4));
        System.out.println();

        System.out.println("Double List");
        doubleLista.adauga(1.1);
        doubleLista.adauga(2.2);
        doubleLista.adauga(3.3);
        doubleLista.adauga(4.4);
        doubleLista.afiseaza();
        System.out.println(doubleLista.cauta(9.9));
        System.out.println();

        System.out.println("String List");
        stringLista.adauga("Ana");
        stringLista.adauga("are");
        stringLista.adauga("mere");
        stringLista.afiseaza();
        System.out.println(stringLista.cauta("are"));
        System.out.println();
    }
}
