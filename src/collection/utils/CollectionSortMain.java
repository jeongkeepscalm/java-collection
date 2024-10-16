package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        Collections.shuffle(list);
        System.out.println("list shuffled = " + list);

        Collections.sort(list); // list.sort(null);
        System.out.println("list sorted asc = " + list);

        Collections.reverse(list);
        System.out.println("list sorted desc = " + list);



    }
}
