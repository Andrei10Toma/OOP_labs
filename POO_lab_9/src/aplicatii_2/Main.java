package aplicatii_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void pretRaftMaxim(List<? extends Produs> produsLista) {
        double max = Double.MIN_VALUE;
        Produs maxProduct = null;
        for (Produs produs: produsLista) {
            if (produs.pretRaft() > max) {
                max = produs.pretRaft();
                maxProduct = produs;
            }
        }
        assert maxProduct != null;
        maxProduct.afiseaza();
    }

    public static void pretRaftMaximPerProdus(List<? extends Produs> produsLista) {
        Produs maxProdusAlimentar = null;
        Produs maxProdusCuratenie = null;
        Produs maxProdusIgiena = null;
        double maxPretAlimentar = Double.MIN_VALUE;
        double maxPretCuratenie = Double.MIN_VALUE;
        double maxPretIgiena = Double.MIN_VALUE;
        for (Produs produs: produsLista) {
            if (produs instanceof ProdusAlimentar) {
                if (produs.pretRaft() > maxPretAlimentar) {
                    maxPretAlimentar = produs.pretRaft();
                    maxProdusAlimentar = produs;
                }
            }
            else if (produs instanceof ProdusCuratenie) {
                if (produs.pretRaft() > maxPretCuratenie) {
                    maxPretCuratenie = produs.pretRaft();
                    maxProdusCuratenie = produs;
                }
            }
            else {
                if (produs.pretRaft() > maxPretIgiena) {
                    maxPretIgiena = produs.pretRaft();
                    maxProdusIgiena = produs;
                }
            }
        }
        assert maxProdusAlimentar != null;
        maxProdusAlimentar.afiseaza();
        assert maxProdusCuratenie != null;
        maxProdusCuratenie.afiseaza();
        assert maxProdusIgiena != null;
        maxProdusIgiena.afiseaza();
    }

    public static void main(String[] args) {
        List<Produs> produsList = new ArrayList<>();
        produsList.add(new ProdusAlimentar(3.3));
        produsList.add(new ProdusCuratenie(2.7));
        produsList.add(new ProdusIgiena(6.9));
        produsList.add(new ProdusAlimentar(4.2));
        produsList.add(new ProdusIgiena(4.8));
        produsList.add(new ProdusAlimentar(6.8));
        produsList.add(new ProdusCuratenie(2.8));
        for (Produs produs: produsList) {
            produs.afiseaza();
        }
        System.out.println();
        System.out.println("Produs maxim cu pretul la raft maxim:");
        pretRaftMaxim(produsList);
        System.out.println("Produsele cu pretul maxim pe fiecare categorie de produse:");
        pretRaftMaximPerProdus(produsList);
    }
}
