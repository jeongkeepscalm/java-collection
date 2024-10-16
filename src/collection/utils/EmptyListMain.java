package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {

        // 빈 가변 리스트 생성
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // 빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList();  // java 5
        List<Integer> list4 = List.of();                // java 9

        System.out.println("list3 = " + list3);
        System.out.println("list4 = " + list4);

    }
}
