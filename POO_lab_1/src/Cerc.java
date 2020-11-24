public class Cerc {
    double raza;
    static int nrObiecte = 0;
    final static double PI = 3.1415;

    Cerc(double raza) {
        this.raza = raza;
        nrObiecte++;
    }

    Cerc() {
    }

    public static int getNrObiecte() {
        return nrObiecte;
    }

    double aria() {
        return this.raza * this.raza * PI;
    }
}
