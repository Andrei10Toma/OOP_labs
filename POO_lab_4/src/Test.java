public class Test {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.adauga(2);
        l.adauga(3);
        l.adauga(1);
        l.adauga(4);
        l.adauga(10);
        l.adaugaPozitie(2, 5);
        l.adaugaPozitie(0, 11);
        l.afisareLista();
        System.out.println(l.elementPozitie(0));
        System.out.println(l.elementPozitie(4));
        System.out.println(l.elimina(0));
        System.out.println(l.elimina(3));
        l.afisareLista();
        l.seteaza(3, 20);
        l.seteaza(l.dimnensiune() - 1, 31);
        l.afisareLista();
        System.out.println(l.dimnensiune());
    }
}
