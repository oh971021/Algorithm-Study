package Programers;

import java.util.ArrayList;
import java.util.List;

/**
 * 정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다.
 * intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간입니다. 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.
 * 이때 배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 만들어 return 하는 solution 함수를 완성해 주세요.
 */
public class 배열만들기3 {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();

        for (int i = intervals[0][0]; i < intervals[0][1]; i++) {
            answer.add(arr[i]);
        }

        for (int i = intervals[1][0]; i < intervals[1][1]; i++) {
            answer.add(arr[i]);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        배열만들기3 T = new 배열만들기3();

        for(int i : T.solution(new int[]{1,2,3,4,5}, new int[][]{{1,3},{0,4}})) {
            System.out.println(i);
        };
    }
}
