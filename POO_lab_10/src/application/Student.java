package application;

public class Student {
    private String name;
    private float mean;

    public Student(String name, float mean) {
        this.name = name;
        this.mean = mean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMean() {
        return mean;
    }

    public void setMean(float mean) {
        this.mean = mean;
    }

    @Override
    public String toString() {
        return name + " " + mean;
    }
}
