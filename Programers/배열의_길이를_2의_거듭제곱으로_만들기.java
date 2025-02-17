package Programers;

/**
 * 정수 배열 arr이 매개변수로 주어집니다. arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
 * arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
 */
public class 배열의_길이를_2의_거듭제곱으로_만들기 {
    public int[] solution(int[] arr) {
        int len = arr.length;

        int pow = 0;
        while(len > Math.pow(2, pow)) {
            pow++;
        }

        int[] answer = new int[(int)Math.pow(2, pow)];
        for(int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        배열의_길이를_2의_거듭제곱으로_만들기 T = new 배열의_길이를_2의_거듭제곱으로_만들기();

        for(int i : T.solution(new int[]{1, 2, 3, 4, 5, 6})) {
            System.out.println(i);
        };
    }
}
