public class TestCerc {
    public static void main(String[] args) {
        System.out.println("Numar obiecte = " +  Cerc.getNrObiecte());

        Cerc c1 = new Cerc(2.0);
        Cerc c2 = new Cerc(3.0);

        System.out.println("Numar obiecte = " +  Cerc.getNrObiecte());
    }
}
