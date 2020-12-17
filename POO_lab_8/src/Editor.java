public class Editor {
    private int index = 0;
    private final Comanda[] listaComenzi  = new Comanda[10];

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Comanda[] getListaComenzi() {
        return listaComenzi;
    }

    public void adaugaComanda(Comanda comanda) {
        listaComenzi[index] = comanda;
        index++;
    }

    public void executaComenzi(Imagine imagine) {
        for (int i = 0; i < index; i++) {
            listaComenzi[i].executa(imagine);
            System.out.println(imagine);
        }
    }

    public void reexecuta(Imagine imagine) {
        listaComenzi[index - 1].executa(imagine);
        System.out.println(imagine);
    }

    public void anuleaza(Imagine imagine) {
        listaComenzi[index - 1].anuleaza(imagine);
        System.out.println(imagine);
        index--;
    }
}
