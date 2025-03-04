package Programers;

/**
 * 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다.
 * 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
 */
public class 조건에_맞게_수열_변환하기1 {
    public int[] solution(int[] arr) {
        int[] answer = arr;

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] % 2 == 0 && answer[i] >= 50) {
                answer[i] /= 2;
            } else if (answer[i] % 2 != 0 && answer[i] < 50) {
                answer[i] *= 2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        조건에_맞게_수열_변환하기1 T = new 조건에_맞게_수열_변환하기1();

        for(int i : T.solution(new int[]{1,2,3,100,99,98})) {
            System.out.println(i);
        }
    }
}
