import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            Persoana[] persoane = new Persoana[4];
            Scanner s = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                Cont c = new Cont(s.nextInt(), s.nextInt());
                persoane[i] = new Persoana(c, s.next(), s.next());
            }

            for (int i = 0; i < 4; i++) {
                persoane[i].afiseazaInformatii();
            }
            System.out.println();

            for (int i = 0; i < 4; i++) {
                persoane[i].getCont().retrage(1000);
                persoane[i].afiseazaInformatii();
            }
        }
        catch (ExceptieCnpInvalid | ExceptieFonduriIsuficiente ce) {
            System.err.println(ce.getMessage());
        }
    }
}
