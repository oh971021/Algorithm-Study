package InfLearn.Integer;

import java.util.Scanner;

/**
 * 등수 구하기
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 *
 * 풀이 요약
 * 큰 친구가 있으면 +1 없으면 대입
 */
public class FindRank {
    /**
     * 문제 풀이
     */
    public int[] solution(int n, int[] nArr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (nArr[i] < nArr[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }

    /**
     * 강의 풀이
     */
    public int[] solution2(int n, int[] nArr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (nArr[j] > nArr[i]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];

        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        FindRank T = new FindRank();

//        for (int i : T.solution(n, nArr)) {
//            System.out.print(i + " ");
//        }

        for (int i : T.solution2(n, nArr)) {
            System.out.print(i + " ");
        }
    }
}
