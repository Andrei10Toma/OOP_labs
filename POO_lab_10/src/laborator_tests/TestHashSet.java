package laborator_tests;

import java.util.*;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Ana");
        set.add("Maria");
        set.add("Andrei");
        set.add("Mihai");
        set.add("Ana");
        System.out.println(set);
        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println("Multimea sortata: " + treeSet);
        System.out.println("Primul element: " + treeSet.first());
        System.out.println("Ultimul element: " + treeSet.last());
        System.out.println("Varful: " + treeSet.headSet("Maria"));
        System.out.println("Coada: " + treeSet.tailSet("Maria"));
        System.out.println("Eliminare primul element: " +
                treeSet.pollFirst());
        System.out.println("Eliminare ultimul element: " +
                treeSet.pollLast());
        System.out.println("Noul tree set: " + treeSet);
    }
}


