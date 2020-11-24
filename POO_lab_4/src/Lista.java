
public class Lista {
    private Nod varf;
    private Nod coada;
    private int contor;

    class Nod {
        private int val;
        private Nod urm;

        public Nod(int x) {
            val = x;
            urm = null;
        }

        public Nod() {

        }

        @Override
        public String toString() {
            return val + "->";
        }
    }

    public Lista() {
        contor = 0;
        varf = coada = null;
    }

    public void adauga(int x) {
        Nod n = new Nod(x);
        if (varf == coada && coada == null) {
            varf = n;
        }
        else {
            coada.urm = n;
        }
        contor++;
        coada = n;
    }

    public int dimnensiune() {
        return contor;
    }

    public void adaugaPozitie(int index, int x) {
        if (index < 0 || index >= this.dimnensiune()) {
            System.out.println("Input prost!");
            return;
        }
        Nod n = new Nod(x);
        int i, cnt = 0;
        Nod p, ant = null;
        for (p = varf; p != null; ant = p, p = p.urm) {
            if (cnt == index && index != 0) {
                n.urm = p;
                ant.urm = n;
                contor++;
                return;
            }
            else if (cnt == index) {
                n.urm = varf;
                varf = n;
                contor++;
                return;
            }
            else {
                cnt++;
            }
        }
    }

    public int elementPozitie(int index) {
        if (index < 0 || index >= this.dimnensiune()) {
            System.out.println("Index incorect");
            return -1;
        }
        int i;
        Nod p;
        for (i = 0, p = varf; p != null; p = p.urm, i++) {
            if (i == index) {
                return p.val;
            }
        }
        return -1;
    }

    public int elimina(int index) {
        if (index < 0 || index >= this.dimnensiune()) {
            System.out.println("Index incorect");
            return -1;
        }
        int i;
        Nod p;
        Nod ant = null;
        for (i = 0, p = varf; p != null; ant = p, p = p.urm, i++) {
            if (i == index) {
                if (ant == null) {
                    varf = p.urm;
                }
                else {
                    ant.urm = p.urm;
                }
                contor--;
                return p.val;
            }
        }
        return -1;
    }

    public void seteaza(int index, int x) {
        if (index < 0 || index >= this.dimnensiune()) {
            System.out.println("Index gresit");
            return;
        }
        int i;
        Nod p;
        for (i = 0, p = varf; p != null; p = p.urm, i++) {
            if (i == index) {
                p.val = x;
            }
        }
    }

    public void afisareLista() {
        for (Nod n = varf; n != null; n = n.urm) {
            System.out.print(n);
        }
        System.out.println();
    }
}
