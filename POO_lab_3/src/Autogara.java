import java.util.Arrays;
import java.util.Scanner;

public class Autogara {
    MijlocTransport[] mt;

    public Autogara(int lungime) {
        mt = new MijlocTransport[lungime];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < lungime; i++) {
            String tip = s.next();
            if (tip.equals("a")) {
                mt[i] = new Autobuz(s.next(), s.nextBoolean(), s.nextInt(), s.nextInt());
            }
            else if (tip.equals("m")) {
                mt[i] = new Microbuz(s.next(), s.nextBoolean(), s.nextInt(), s.nextInt());
            }
        }
    }

    public void afiseazaAutogara() {
        for (MijlocTransport mijlocTransport : mt) {
            mijlocTransport.afiseaza();
        }
    }

    public int profitTotal() {
        int pt = 0;
        for (MijlocTransport mijlocTransport : mt) {
            pt += mijlocTransport.profit();
        }
        return pt;
    }

    public void sortare() {
        Arrays.sort(mt);
    }
}