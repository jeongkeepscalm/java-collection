package collection.compare;

public class MyUser implements Comparable<MyUser> {

    private String id;
    private int age;

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    // 객체 내 age 를 기준으로 오름차순 정렬 
    @Override
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

}
