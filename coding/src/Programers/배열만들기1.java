package Programers;

import java.util.ArrayList;
import java.util.List;

/**
 * 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 */
public class 배열만들기1 {
    public int[] solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        배열만들기1 T = new 배열만들기1();

        T.solution(10, 3);
    }
}
