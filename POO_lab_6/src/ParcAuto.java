import java.io.*;
import java.nio.Buffer;

public class ParcAuto{
    private String numeFisier;

    public ParcAuto(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public int numaraMasiniNoi() throws IOException {
        int numarMasiniNoi = 0;
        File f = new File(numeFisier);
        FileReader reader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            Auto a = Auto.citeste(bufferedReader);
            if (a == null) {
                bufferedReader.close();
                return numarMasiniNoi;
            }
            if (a.getKm() == 0) {
                numarMasiniNoi++;
            }
        }
    }

    public Auto celMaiScumpAuto() throws IOException {
        File f = new File(numeFisier);
        FileReader reader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(reader);
        Auto maxAuto = Auto.citeste(bufferedReader);
        if (maxAuto == null) {
            bufferedReader.close();
            return null;
        }

        while (true) {
            Auto a = Auto.citeste(bufferedReader);
            if (a == null) {
                bufferedReader.close();
                return maxAuto;
            }
            if (a.getPret() > maxAuto.getPret())
                maxAuto = a;
        }
    }

    public void adaugaAuto(Auto a) throws IOException {
        BufferedWriter f = new BufferedWriter(new FileWriter(numeFisier, true));
        f.write(a.getModel());
        f.newLine();
        f.write(String.valueOf(a.getAn()));
        f.newLine();
        f.write(String.valueOf(a.getKm()));
        f.newLine();
        f.write(String.valueOf(a.getPret()));
        f.newLine();
        f.close();
    }

    public boolean cauta(Auto a) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(numeFisier));
        while (true) {
            Auto auto = Auto.citeste(bufferedReader);
            if (auto == null) {
                bufferedReader.close();
                return false;
            }
            if (auto.equals(a)) {
                bufferedReader.close();
                return true;
            }
        }
    }

    public void afiseazaParcAuto() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(numeFisier));
        while (true) {
            Auto auto = Auto.citeste(bufferedReader);
            if (auto == null) {
                bufferedReader.close();
                return;
            }
            System.out.println(auto);
        }
    }
}
