package InfLearn.Integer;

import java.util.Scanner;

/**
 * 소수 (에라토스테네스 체)
 *
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 *
 * 풀이 요약
 * 작은 수부터 찾으면서, 그 수의 배수는 카운팅에서 제외한다.
 *
 * 소수란 ?
 * 1과 자기자신으로만 나누어지는 수
 */
public class Prime {
    /**
     * 문제 풀이
     * 타임 리밋..
     */
    public int Solution(int N) {
        int answer = 0;

        for (int i = 2; i <= N; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            if (cnt < 3) {
                answer++;
                cnt = 0;
            }
        }

        return answer;
    }

    /**
     * 강의 풀이
     */
    public int Solution2(int N) {
        int answer = 0;

        int[] ch = new int[N+1];

        // 소수 처리
        for (int i = 2; i < N; i++) {
            if (ch[i] == 0) {
                answer++;

                // 배수 처리
                for (int j = i; j <= N; j=j+i) {
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Prime T = new Prime();

        //System.out.println(T.Solution(sc.nextInt()));
        System.out.println(T.Solution(sc.nextInt()));
    }
}
