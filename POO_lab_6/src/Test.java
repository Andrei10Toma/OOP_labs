import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            ParcAuto parcAuto = new ParcAuto("date");
            System.out.println("Numar masini noi: " + parcAuto.numaraMasiniNoi());
            System.out.println("Cea mai scumpa masina: " + parcAuto.celMaiScumpAuto());
            Auto a = new Auto("Dacia", 2020, 100, 10000.0);
            parcAuto.adaugaAuto(a);
            Auto aCautat = new Auto("Dacia", 2020, 100, 10000.0);
            System.out.println("Cauta masina: " + parcAuto.cauta(aCautat));
            parcAuto.afiseazaParcAuto();
        }
        catch (IOException e){
            System.out.println("Got ya!");
        }
    }
}
