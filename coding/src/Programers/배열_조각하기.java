package Programers;

import java.util.ArrayList;
import java.util.List;

/**
 * 정수 배열 arr와 query가 주어집니다.
 *
 * query를 순회하면서 다음 작업을 반복합니다.
 *
 * 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
 * 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
 * 위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
 */
public class 배열_조각하기 {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        for (int i : arr) answer.add(i);



        return answer.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        배열_조각하기 T = new 배열_조각하기();

        for (int i : T.solution(new int[]{0,1,2,3,4,5}, new int[]{4,1,2})) {
            System.out.println(i);
        };
    }
}
