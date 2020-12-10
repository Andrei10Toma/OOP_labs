package decorator_text;

public abstract class SecventaDecorator implements Secventa {
    SecventaCuvant cuv;

    protected SecventaDecorator(SecventaCuvant cuv) {
        this.cuv = cuv;
    }

    public String parcurge() {
        return cuv.parcurge();
    }
}
