package InfLearn.Integer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 피보나치 수열
 *
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 * 풀이 요약
 * 변수 3개를 만들어서, 전값 전전값을 넣고 돌리면서 계산한다. 첫 번째, 두 번째는 무조건 1
 *
 * GPT가 갑자기 N번째 수열을 출력하는 솔루션을 만들어줬다.. 나도 피곤한데 저 친구도 피곤한가보다.
 */
public class FibonacciSequence {
    /**
     * 문제 풀이
     */
    public int[] Solution(int N) {
        int[] answer = new int[N];

        answer[0] = 1;
        answer[1] = 1;

        int a = 0, b = 1, c;
        for (int i = 2; i < N; i++) {
            c = a + b;
            a = b;
            b = c;

            answer[i] = c;
        }

        return answer;
    }

    /**
     * GPT 풀이
     */
    public int Solution2(int N) {
        if (N <= 1) {
            return N;
        }

        int a = 0, b = 1, c = 0;
        for (int i = 1; i < N; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    /**
     * 강의 풀이
     */
    public int[] Solution3(int N) {
        int[] answer = new int[N];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < N; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }

    /**
     * 배열 쓰지 말아라
     */
    public void Solution4(int N) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < N; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FibonacciSequence T = new FibonacciSequence();

//        for (int i : T.Solution(sc.nextInt())) {
//            System.out.print(i + " ");
//        }

//        System.out.print(T.Solution2(sc.nextInt()));

//        for (int i : T.Solution3(sc.nextInt())) {
//            System.out.print(i + " ");
//        }

        T.Solution4(sc.nextInt());
    }
}
