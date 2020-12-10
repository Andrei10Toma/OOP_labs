package decorator_text;

public class SecventaMajuscule extends SecventaDecorator {
    String cuvMaj;
    int index = -1;

    public SecventaMajuscule(SecventaCuvant cuv) {
        super(cuv);
    }

    @Override
    public String parcurge() {
        index++;
        cuvMaj = super.parcurge();
        return cuvMaj.toUpperCase();
    }
}
