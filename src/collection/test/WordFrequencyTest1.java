package collection.test;

import java.util.HashMap;

/*
    각각의 단어가 나타난 수 출력
 */
public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        HashMap<String, Integer> map = new HashMap<>();
        String[] wordArray = text.split(" ");
        for (String word : wordArray) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println("map = " + map);
    }
}
