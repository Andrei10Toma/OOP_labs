package aplicatii_2;

public abstract class Produs implements Comparable<Object> {
    public abstract double pretRaft();
    public abstract void afiseaza();

    @Override
    public int compareTo(Object o) {
        return Double.compare(this.pretRaft(), ((Produs) o).pretRaft());
    }
}
