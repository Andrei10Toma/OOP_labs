package bonus;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Pacient> pacientPriorityQueue = new PriorityQueue<>();
        pacientPriorityQueue.add(new Pacient("Andrei", 10));
        pacientPriorityQueue.add(new Pacient("Codrin", 20));
        pacientPriorityQueue.add(new Pacient("Raluca", 15));
        pacientPriorityQueue.add(new Pacient("Alex", 9));
        pacientPriorityQueue.add(new Pacient("Silvia", 20));
        pacientPriorityQueue.add(new Pacient("Stefan", 7));
        while (!pacientPriorityQueue.isEmpty()) {
            System.out.println(pacientPriorityQueue.remove());
        }
    }
}
