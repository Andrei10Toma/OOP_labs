package aplicatii_lab_1;

public class NumarRational {
    private int m, n;

    NumarRational() {
    }

    NumarRational(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    static NumarRational Suma(NumarRational r1, NumarRational r2) {
        if (r1.m == 0) {
            return r2;
        }

        if (r2.m == 0) {
            return r1;
        }

        NumarRational rezultat = new NumarRational();
        rezultat.m = r1.m * r2.n + r2.m * r1.n;
        rezultat.n = r1.n * r2.n;
        return rezultat;
    }

    static NumarRational Produs(NumarRational r1, NumarRational r2) {
        NumarRational rezultat = new NumarRational();
        rezultat.m = r1.m * r2.m;
        rezultat.n = r1.n * r2.n;
        return rezultat;
    }

    public void AfisareNumarRational() {
        System.out.println(this.m + "/" + this.n);
    }

    public boolean maiMare(NumarRational r) {
        if (this.n != r.n) {
            if (this.m * r.n > r.m * this.n) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (this.m > r.m) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
