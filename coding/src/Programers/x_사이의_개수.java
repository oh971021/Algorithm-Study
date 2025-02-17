package Programers;

import java.util.*;

/**
 * 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때
 * 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 */
public class x_사이의_개수 {
    public int[] solution(String myString) {
        String[] temp = myString.split("x");

        List<Integer> answer = new ArrayList<>();

        for (String s : temp) {
            answer.add(s.length());
        }

        if (myString.charAt(myString.length()-1) == 'x') {
            answer.add(0);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        x_사이의_개수 T = new x_사이의_개수();

        for (int i : T.solution("oxooxoxxox")) {
            System.out.print(i + " ");
        };
    }
}
