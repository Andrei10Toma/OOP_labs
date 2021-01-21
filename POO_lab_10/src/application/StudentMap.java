package application;

import java.util.*;

public class StudentMap {
    private Map<Integer, ArrayList<Student>> m = new TreeMap<>(new Comparator<>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    public void addStudent(Student s) {
        if (!m.containsKey(Math.round(s.getMean()))){
            m.put(Math.round(s.getMean()), new ArrayList<>());
        }
        m.get(Math.round(s.getMean())).add(s);
    }

    public Map<Integer, ArrayList<Student>> getM() {
        return m;
    }
}
