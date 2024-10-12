package collection.test;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Map 에 들어있는 데이터 중에 값이 1000원인 모든 상품을 출력
 */
public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        ArrayList<String> fruitList = new ArrayList<>();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == 1000) {
                fruitList.add(entry.getKey());
            }
        }

        System.out.println("fruitList = " + fruitList);

    }
}
