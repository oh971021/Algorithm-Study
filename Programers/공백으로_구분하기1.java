package Programers;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
 * my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 */
public class 공백으로_구분하기1 {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(my_string, " ", false);

        while(st.hasMoreTokens()) {
            answer.add(st.nextToken());
        }

        return answer.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        공백으로_구분하기1 T = new 공백으로_구분하기1();

        for(String s : T.solution("i love you")) {
            System.out.println(s);
        };
    }
}
