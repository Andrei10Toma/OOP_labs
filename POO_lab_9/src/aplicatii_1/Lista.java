package aplicatii_1;

public class Lista <E> {
    private E[] tablou;
    private int nr;

    public Lista(int dim) {
        if (dim < 0) {
            throw new IllegalArgumentException("Dimensiunea trebuie sa fie mai mare decat 0.");
        }
        tablou = (E[]) new Object[dim];
        nr = 0;
    }

    public void redimensioneaza() {
        E[] aux = (E[]) new Object[tablou.length * 2];
        System.arraycopy(tablou, 0, aux, 0, tablou.length);
        tablou = aux;
    }

    public void adauga(E x) {
        if (nr == tablou.length) {
            redimensioneaza();
        }
        tablou[nr] = x;
        nr++;
    }

    public void afiseaza() {
        for (int i = 0; i < nr; i++) {
            System.out.println(tablou[i]);
        }
    }

    public boolean cauta(E x) {
        for (int i = 0; i < nr; i++) {
            if (tablou[i].equals(x)) {
                return true;
            }
        }
        return false;
    }
}
