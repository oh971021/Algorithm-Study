package Programers;

import java.util.ArrayList;
import java.util.List;

/**
 * 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */
public class N개_간격의_원소들 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num_list.length; i += n) {
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        N개_간격의_원소들 T = new N개_간격의_원소들();

        for(int i : T.solution(new int[]{4,2,6,1,7,6}, 2)) {
            System.out.println(i);
        }
    }
}
