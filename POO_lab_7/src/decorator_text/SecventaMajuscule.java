package decorator_text;

public class SecventaMajuscule extends SecventaDecorator {
    int index = -1;
    String cuvMaj = super.parcurge();

    public SecventaMajuscule(SecventaCuvant cuv) {
        super(cuv);
    }

    @Override
    public String parcurge() {
        index++;
        return Character.toUpperCase(cuvMaj.charAt(index)) + "";
    }
}
