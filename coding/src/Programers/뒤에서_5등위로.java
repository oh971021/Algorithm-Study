package Programers;

import java.util.Arrays;

/**
 * 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */
public class 뒤에서_5등위로 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);

        for (int i = 5; i < num_list.length; i++) {
            answer[i - 5] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        뒤에서_5등위로 T = new 뒤에서_5등위로();
        for(int i : T.solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 1})) {
            System.out.println(i);
        };
    }
}
