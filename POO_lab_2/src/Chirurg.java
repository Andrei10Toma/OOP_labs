import java.util.Objects;

public class Chirurg extends Doctor{
    private String expertiza;

    public Chirurg(String expertiza) {
        this.expertiza = expertiza;
    }

    public Chirurg(String nume, String expertiza) {
        super(nume);
        this.expertiza = expertiza;
    }

    public  Chirurg(){
    }

    public String getExpertiza() {
        return expertiza;
    }

    public void setExpertiza(String expertiza) {
        this.expertiza = expertiza;
    }

    public void opereaza() {
        System.out.println(this.getNume() + " " + " opereaza.");
    }

    @Override
    public String toString() {
        return this.getNume() + " " + expertiza;
    }

    @Override
    public boolean equals(Object o) {
        Chirurg c = (Chirurg)o;
        if (this.expertiza == c.expertiza && this.getNume() == c.getNume()) {
            return true;
        }
        else {
            return false;
        }
    }
}
