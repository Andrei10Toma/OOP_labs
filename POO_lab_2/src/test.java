import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Doctor[] doctori = new Doctor[10];

        doctori[0] = new Chirurg("Ion","oftamologie");
        doctori[1] = new Chirurg("Andrei", "ortopedie");
        doctori[2] = new Generalist("Alexandru", 2);
        doctori[3] = new Generalist("Vasile", 10);
        doctori[4] = new Chirurg("Mihai", "urologie");
        doctori[5] = new Chirurg("Andrei", "ortopedie");
        doctori[6] = new Chirurg("Andrei", "ortopedie");
        doctori[7] = new Generalist("Ion", 5);
        doctori[8] = new Generalist("Lucian", 1);
        doctori[9] = new Generalist("Vladi", 4);

        for (int i = 0; i < doctori.length; i++) {
            System.out.println(doctori[i]);
        }

        int contorGeneralisti = 0;
        for (int i = 0; i < doctori.length; i++) {
            if (doctori[i] instanceof Chirurg) {
                ((Chirurg) doctori[i]).opereaza();
            }
            if (doctori[i] instanceof Generalist) {
                contorGeneralisti++;
                ((Generalist) doctori[i]).prescrieRetete();
            }
        }

        int contor = 0;
        for (int i = 0; i < doctori.length; i++) {
            for (int j = i + 1; j < doctori.length; j++) {
                if (doctori[i] instanceof Chirurg && doctori[j] instanceof Chirurg) {
                    if (((Chirurg) doctori[i]).equals(doctori[j])) {
                        contor++;
                    }
                }
            }
            if (contor > 2) {
                System.out.println("Exista 2 sau mai multi chirurgi!");
                break;
            }
        }

        Generalist[] generalisti = new Generalist[contorGeneralisti];
        contorGeneralisti = 0;
        for (int i = 0; i < doctori.length; i++) {
            if (doctori[i] instanceof Generalist) {
                generalisti[contorGeneralisti] = new Generalist(doctori[i].getNume(),
                        ((Generalist) doctori[i]).getNrPacienti());
                contorGeneralisti++;
            }
        }

        System.out.println("Array nesortat:");
        for (int i = 0; i < generalisti.length; i++) {
            System.out.println(generalisti[i]);
        }

        Arrays.sort(generalisti, Generalist::compareTo);

        //BONUS
        int suma = 0;
        System.out.println("Array sortat:");
        for (int i = 0; i < generalisti.length; i++) {
            System.out.println(generalisti[i]);
            suma += generalisti[i].getNrPacienti();
        }
        float media = (float) suma / generalisti.length;

        System.out.println(media);

        for (int i = 0; i < generalisti.length; i++) {
            if ((float)generalisti[i].getNrPacienti() > media) {
                System.out.println(generalisti[i].getNume());
            }
        }
    }
}
