public class Main {
    public static void main(String[] args) {
        Imagine imagine = new Imagine(150, 120, 0);
        Comanda comandaRedimenosionare = new ComandaRedimensionare();
        Comanda comandaRedecupare = new ComandaRedecupare();
        Comanda comandaLuminozitate = new ComandaLuminozitate();
        Editor editor = new Editor();
        editor.adaugaComanda(comandaRedimenosionare);
        editor.adaugaComanda(comandaRedecupare);
        editor.adaugaComanda(comandaLuminozitate);
        editor.adaugaComanda(comandaRedimenosionare);
        editor.adaugaComanda(comandaLuminozitate);
        editor.adaugaComanda(comandaRedecupare);
        editor.adaugaComanda(comandaLuminozitate);
        System.out.println(imagine);
        editor.executaComenzi(imagine);
        editor.reexecuta(imagine);
        editor.anuleaza(imagine);
    }
}
