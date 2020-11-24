package aplicatii_lab_1;

public class TestNumarRational {

    static void swapNumere(NumarRational[] r, int i, int j) {
        NumarRational aux;
        aux = r[i];
        r[i] = r[j];
        r[j] = aux;
    }

    public static void main(String[] args) {

        java.util.Scanner s = new java.util.Scanner(System.in);
        int k = s.nextInt();

        NumarRational[] r = new NumarRational[k];

        for (int i = 0; i < k; i++) {
            r[i] = new NumarRational();
        }

        for (int i = 0; i < k; i++) {
            r[i].setM(s.nextInt());
            r[i].setN(s.nextInt());
        }


        for (int i = 0; i < k; i++) {
            r[i].AfisareNumarRational();

        }

        NumarRational sum = new NumarRational();
        NumarRational prod = new NumarRational(1, 1);

        for (int i = 0; i < k; i++) {
            sum = sum.Suma(sum, r[i]);
            prod = prod.Produs(prod, r[i]);
        }

        System.out.print("Suma: "); sum.AfisareNumarRational();
        System.out.print("Produsul: "); prod.AfisareNumarRational();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (r[j].maiMare(r[i])) {
                    swapNumere(r, i, j);
                }
            }
        }
        for (int i = 0; i < k; i++) {
            r[i].AfisareNumarRational();
        }
    }
}
