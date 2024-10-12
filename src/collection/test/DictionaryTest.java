package collection.test;

import java.util.HashMap;
import java.util.Scanner;

/*
    문제5 - 영어 사전 만들기

    문제 설명
    영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전을 만들자.
    먼저 영어 단어와 한글 단어를 사전에 저장하는 단계를 거친다.
    이후에 단어를 검색한다.
 */
public class DictionaryTest {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("* 단어 입력 단계");
        while (true) {
            System.out.println("영단어를 입력하세요. (종료 'q') : ");
            String englishWord = scanner.nextLine();
            if (englishWord.equals("q")) {
                break;
            }
            System.out.println("입력한 영단어의 뜻을 입력하세요: ");
            String koreanWord = scanner.nextLine();
            dictionary.put(englishWord, koreanWord);
        }

        System.out.println("* 단어 검색 단계");
        while (true) {
            System.out.println("찾을 영단어를 입력하세요. (종료 'q') : ");
            String searchWord = scanner.nextLine();
            if (searchWord.equals("q")) {
                break;
            }
            if (dictionary.containsKey(searchWord)) {
                String koreanMeaning = dictionary.get(searchWord);
                System.out.println(searchWord + "의 뜻: " + koreanMeaning);
            } else {
                System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }

}
