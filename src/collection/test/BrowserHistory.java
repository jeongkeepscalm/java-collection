package collection.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage;


    public void visitPage(String url) {
        if (null != currentPage) history.offerLast(url);
        currentPage = url;
        System.out.println("visit: " + url);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pollLast();
            System.out.println("go back: " + currentPage);
            return currentPage;
        }
        return null;
    }

}
