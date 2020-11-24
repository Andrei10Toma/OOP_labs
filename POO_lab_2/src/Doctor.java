public class Doctor {
    private String nume;

    public Doctor(String nume) {
        this.nume = nume;
    }

    public Doctor() {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return this.nume;
    }
}
