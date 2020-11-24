public class TestPatrat {
    public static void main(String[] args) {
        patrat p1 = new patrat();
        System.out.println("Aria1 = " + p1.aria());

        patrat p2 = new patrat(5.0);
        System.out.println("Aria2 = " + p2.aria());
    }
}
