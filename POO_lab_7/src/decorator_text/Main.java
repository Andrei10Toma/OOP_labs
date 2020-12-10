package decorator_text;

public class Main {
    public static void main(String[] args) {
        SecventaCuvant secventaCuvant = new SecventaCuvant("Ana are mere");
        SecventaCaracter secventaCaracter = new SecventaCaracter(secventaCuvant);
        for (int i = 0; i < 5; i++) {
            System.out.println(secventaCaracter.parcurge());
        }
        System.out.println(secventaCuvant.parcurge());

        SecventaCuvant secventaCuvant1 = new SecventaCuvant("Avem laborator la POO acum");
        SecventaMajuscule secventaMajuscule = new SecventaMajuscule(secventaCuvant1);
        for (int i = 0; i < 4; i++) {
            System.out.println(secventaMajuscule.parcurge());
        }
        System.out.println(secventaCuvant1.parcurge());
        System.out.println(secventaCuvant1.parcurge());
    }
}
