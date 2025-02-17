package Programers;

import java.util.ArrayList;
import java.util.List;

public class ad_제거하기 {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) answer.add(s);
        }

        return answer.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        ad_제거하기 T = new ad_제거하기();

        for (String s : T.solution(new String[]{"and", "notad","abcd", "ad1", "ad2"})) {
            System.out.println(s);
        }
    }
}
