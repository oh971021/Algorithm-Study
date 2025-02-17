package Programers;

import java.util.Arrays;

/**
 * 정수로 이루어진 리스트 num_list가 주어집니다.
 * num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */
public class 뒤에서_5등까지 {
    /**
     * 다른 사람 풀이
     * @param num_list
     * @return
     */
    public int[] solution2(int[] num_list) {
        return Arrays.stream(num_list).sorted().limit(5).toArray();
    }

    /**
     * 나의 풀이
     * @param num_list
     * @return
     */
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = new int[5];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        뒤에서_5등까지 T = new 뒤에서_5등까지();
        for(int i : T.solution2(new int[]{12, 4, 15, 46, 38, 1, 14})) {
            System.out.println(i);
        };
    }
}
