package Array;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("is");
        list.add("s");
        list.add(0, "He");
        list.add("Good");
        list.add("Boy");

        System.out.println("List: " + list);
    }
}
