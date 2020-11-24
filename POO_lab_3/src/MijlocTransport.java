public abstract class MijlocTransport implements Comparable<Object>{
    public String culoare;
    public boolean funcional;

    public MijlocTransport() {
        culoare = "alb";
        funcional = false;
    }

    public MijlocTransport(String culoare, boolean funcional) {
        this.culoare = culoare;
        this.funcional = funcional;
    }

    //Getter Setter culoare
    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    //Getter Setter Functional
    public boolean isFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }

    //Metodele abstracte care urmeaza a fi implementate
    public abstract int incasare();

    public abstract int profit();

    public abstract void afiseaza();

    public int compareTo(Object o) {
        if (profit() > ((MijlocTransport)o).profit()) {
            return 1;
        }
        else if (profit() < ((MijlocTransport)o).profit()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
