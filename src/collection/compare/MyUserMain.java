package collection.compare;

import java.util.*;

public class MyUserMain {
    public static void main(String[] args) {

        // MyUser: Comparable 인터페이스 구현
        MyUser a = new MyUser("a", 30);
        MyUser b = new MyUser("b", 20);
        MyUser c = new MyUser("c", 40);

        /** Array **/
        MyUser[] users = {a, b, c};

        // age 로 정렬
        Arrays.sort(users);
        System.out.println("array sorted by age = " + Arrays.toString(users));

        // id 로 오름차순 정렬
        Arrays.sort(users, new IdComparator());
        System.out.println("array sorted asc by id = " + Arrays.toString(users));

        // id 로 내림차수 정렬
        Arrays.sort(users, new IdComparator().reversed());
        System.out.println("array sorted desc by id = " + Arrays.toString(users));


        /** List **/
        ArrayList<MyUser> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        // age 로 정렬
        list.sort(null); // Collections.sort(list);
        System.out.println("list sorted by age = " + list);

        // id 로 정렬
        list.sort(new IdComparator()); // Collections.sort(list, new IdComparator());
        System.out.println("list sorted by id = " + list);


        /** TreeSet **/
        Set<MyUser> set1 = new TreeSet<>();
        set1.add(a);
        set1.add(b);
        set1.add(c);
        
        // age 로 정렬(기본으로 정렬되어 있음)
        System.out.println("set1 sorted by age = " + set1);

        // id 로 정렬
        Set<MyUser> set2 = new TreeSet<>(new IdComparator());
        set2.add(a);
        set2.add(b);
        set2.add(c);
        System.out.println("set2 sorted by age = " + set2);

    }

}
