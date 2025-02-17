package InfLearn.Integer;

import java.util.Scanner;

/**
 * 격자판 최대합
 *
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 * 풀이 요약
 * 각 합들을 정답값과 비교하면서 바꿔준다.
 *
 * => nArr[i] == nArr[j] 보다는 nArr[i][i] 를 사용하자..!!
 * => [n-i-1] ..
 */
public class GridMaxSum {
    /**
     * 문제 풀이
     */
    public int solution(int n, int[][] nArr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int maxX = 0, maxY = 0, maxXY = 0, maxYX = 0;
            for (int j = 0; j < n; j++) {
                maxX += nArr[i][j];
                maxY += nArr[j][i];
                maxXY += nArr[i] == nArr[j] ? nArr[i][j] : 0;
                if ((i == 4 && j == 0) || (i == 3 && j == 1) || (i == 2 && j == 2) || (i == 1 && j == 3) || (i == 0 && j == 4)) {
                    maxYX += nArr[i][j];
                }
            }
            answer = Math.max(maxX, answer);
            answer = Math.max(maxY, answer);
            answer = Math.max(maxXY, answer);
            answer = Math.max(maxYX, answer);
        }

        return answer;
    }

    /**
     * 강의 풀이
     */
    public int solution2(int n, int[][] nArr) {
        int answer = 0;
        int sum1,sum2;

        for (int i = 0; i < n; i++) {
            sum1=sum2=0;
            for (int j = 0; j < n; j++) {
                sum1 += nArr[i][j];
                sum2 += nArr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1=sum2=0;
        for (int i = 0; i < n; i++) {
            sum1 += nArr[i][i];
            sum2 += nArr[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] nArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nArr[i][j] = sc.nextInt();
            }
        }

        GridMaxSum T = new GridMaxSum();
        // System.out.print(T.solution(n, nArr));
        System.out.print(T.solution2(n, nArr));
    }
}
