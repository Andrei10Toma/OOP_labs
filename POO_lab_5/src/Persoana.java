public class Persoana {
    private static int nrPersoane = 0;
    private Cont cont;
    private String nume;
    private String cnp;

    public void seteazaDate(String nume, String cnp, Cont cont) throws ExceptieCnpInvalid{
        if (cnp.charAt(0) == '1' || cnp.charAt(0) == '2') {
            this.nume = nume;
            this.cnp = cnp;
            this.cont = cont;
        }
        else {
            throw new ExceptieCnpInvalid("CNP Invalid");
        }
    }

    public Persoana(Cont cont, String nume, String cnp) throws ExceptieCnpInvalid {
        seteazaDate(nume, cnp, cont);
        nrPersoane++;
    }

    public Cont getCont() {
        return cont;
    }

    public void afiseazaInformatii() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "cont=" + cont +
                ", nume='" + nume + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}
