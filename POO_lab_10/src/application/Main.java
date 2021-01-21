package application;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentMap studentMap = new StudentMap();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            Student student = new Student(scanner.next(), scanner.nextFloat());
            studentMap.addStudent(student);
        }
        for(Map.Entry<Integer, ArrayList<Student>> entry : studentMap.getM().entrySet()) {
            System.out.println(entry);
        }
    }
}
