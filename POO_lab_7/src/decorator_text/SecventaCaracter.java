package decorator_text;

public class SecventaCaracter extends SecventaDecorator {
    int index = -1;
    String cuv = super.parcurge();
    public SecventaCaracter(SecventaCuvant cuv) {
        super(cuv);
    }

    public String parcurge() {
        index++;
        return cuv.charAt(index) + "";
    }
}
