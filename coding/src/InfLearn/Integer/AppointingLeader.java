package InfLearn.Integer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 임시반장 정하기
 *
 * 김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.
 * 김갑동 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에 정식으로 선거를 통해 반장을 선출하려고 한다.
 * 그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
 * 위 경우에 4번 학생을 보면 3번 학생과 2학년 때 같은 반이었고, 3번 학생 및 5번 학생과 3학년 때 같은 반이었으며,
 * 2번 학생과는 4학년 때 같은 반이었음을 알 수 있다. 그러므로 이 학급에서 4번 학생과 한번이라도
 * 같은 반이었던 사람은 2번 학생, 3번 학생과 5번 학생으로 모두 3명이다.
 * 이 예에서 4번 학생이 전체 학생 중에서 같은 반이었던 학생 수가 제일 많으므로 임시 반장이 된다.
 * 각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.
 *
 * 풀이 요약
 *
 */
public class AppointingLeader {
    /**
     * 풀이
     */
    public int solution(int n, int[][] nArr) {
        int answer = 0; // 같은 반이 가장 많은 학생
        int[] temp;
        int[] students = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temps = nArr[j][i];
                for (int k = 0; k < n; k++) {
                    if (j != k) {
                        if (temps == nArr[k][i]) students[k]++;
                        System.out.print(k + "번 학생" + temps + " / ");
                        System.out.println(nArr[k][i]);
                    }
                }
            }
        }

        for (int i = 0; i < n-1; i++) {
            if (students[i] < students[i+1]) {
                answer = i+2;
            }
        }

        return answer;
    }

    /**
     * 강의 풀이
     */
    public int solution2(int n, int[][] nArr) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;

            for (int j = 1; j <= n; j++) {
                for (int k = 1; k < 6; k++) {
                    System.out.print(nArr[i][k] + " / ");
                    System.out.println(nArr[j][k]);
                    if (nArr[i][k] == nArr[j][k]) {
                        cnt++;
                        break;
                    }
                }
                System.out.println("========" + cnt);
            }

            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AppointingLeader T = new AppointingLeader();
        int n = sc.nextInt();
        
        int[][] nArr = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 6; j++) {
                nArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution2(n, nArr));
    }
}
