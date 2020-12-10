package decorator_text;

public class SecventaCuvant implements Secventa{
    String[] cuvinte;
    int index = -1;
    @Override
    public String parcurge() {
        index++;
        return cuvinte[index];
    }
    public SecventaCuvant(String text) {
        cuvinte = text.split("[\\s]+");
    }
}
