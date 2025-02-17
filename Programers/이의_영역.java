package Programers;

import java.util.ArrayList;
import java.util.List;

/**
 * 정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
 * 단, arr에 2가 없는 경우 [-1]을 return 합니다.
 */
public class 이의_영역 {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int first = Integer.MIN_VALUE;
        int last = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                first = i;
                break;
            }
        }

        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] == 2) {
                last = i;
                break;
            }
        }

        if (first != Integer.MIN_VALUE && last != Integer.MAX_VALUE) {
            for (int i = first; i <= last; i++) {
                answer.add(arr[i]);
            }
        } else {
            answer.add(-1);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        이의_영역 T = new 이의_영역();

//        for (int i : T.solution(new int[]{1,2,1,4,5,2,9})) {
//            System.out.println(i);
//        };
//        for (int i : T.solution(new int[]{1,2,1})) {
//            System.out.println(i);
//        };
//        for (int i : T.solution(new int[]{1,1,1})) {
//            System.out.println(i);
//        };
//        for (int i : T.solution(new int[]{1,2,1,2,1,10,2,1})) {
//            System.out.println(i);
//        };
    }
}
