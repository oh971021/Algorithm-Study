package Programers;

/**
 * 정수 배열 arr과 정수 n이 매개변수로 주어집니다.
 * arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
 * arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 1,000
 * 1 ≤ arr의 원소 ≤ 1,000
 * 1 ≤ n ≤ 1,000
 */
public class 배열의_길이에_따라_다른_연산하기 {
    /**
     * 다른 사람 풀이
     * @param arr
     * @param n
     * @return
     */
    public int[] solution2(int[] arr, int n) {
        for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
            arr[idx]+=n;
        }

        return arr;
    }

    /**
     * 내 풀이
     * @param arr
     * @param n
     * @return
     */
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        int len = answer.length;

        if (len % 2 == 0) { // 짝수
            for (int i = 0; i < len; i++) {
                if (i % 2 != 0) {
                    answer[i] += n;
                }
            }
        } else { // 홀수
            for (int i = 0; i < len; i++) {
                if (i % 2 == 0) {
                    answer[i] += n;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        배열의_길이에_따라_다른_연산하기 T = new 배열의_길이에_따라_다른_연산하기();

        for(int i : T.solution2(new int[]{49,12,100,276,33}, 27)) {
            System.out.println(i);
        };
    }
}
