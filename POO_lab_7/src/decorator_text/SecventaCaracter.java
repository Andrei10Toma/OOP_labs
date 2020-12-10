package decorator_text;

public class SecventaCaracter extends SecventaDecorator {
    int index = -1;
    String cuv = super.parcurge();
    public SecventaCaracter(SecventaCuvant cuv) {
        super(cuv);
    }

    public String parcurge() {
        index++;
        if (index >= cuv.length()) {
            cuv = super.parcurge();
            index = 0;
            if (cuv == null) {
                return null;
            }
        }
        return cuv.charAt(index) + "";
    }
}
