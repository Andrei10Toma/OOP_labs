package bonus;

import java.util.Objects;

public class Pacient implements Comparable<Pacient> {
    private final String name;
    private final int priority;

    public Pacient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Pacient o) {
        return Integer.compare(o.priority, this.priority);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacient pacient = (Pacient) o;
        return priority == pacient.priority &&
                Objects.equals(name, pacient.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
