package Programers;

import java.util.ArrayList;
import java.util.List;

/**
 * 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
 *
 * n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
 * n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
 * n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
 * n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
 * 올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
 */
public class 리스트_자르기 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        int a = n == 1 ? 0 : slicer[0];
        int b = n == 2 ? num_list.length - 1 : slicer[1];
        int c = n == 4 ? slicer[2] : 1;

        for (int i = a; i <= b; i += c) {
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        리스트_자르기 T = new 리스트_자르기();

        for(int i : T.solution(2, new int[]{0, 1, 1}, new int[]{10,8,6,4,2})) {
            System.out.println(i);
        };
    }
}
