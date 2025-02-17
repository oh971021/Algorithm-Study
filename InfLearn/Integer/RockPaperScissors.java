package InfLearn.Integer;

import java.util.Scanner;

/**
 * 가위 바위 보
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * 예를 들어 N=5이면 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 *
 * 풀이 요약
 * 같을 경우 D, A가 이길 경우 A, 그 외 B를 리턴해준다.
 * 내 문제 풀이처럼 굳이 다 조건문으로 감쌀 필요가 없었다.. 정진하자.
 */
public class RockPaperScissors {
    /**
     * 문제 풀이
     */
    public String Solution(int A, int B) {
        String answer = "D";

        if (A == 1) {
            if (B == 2) answer = "B";
            else if (B == 3) answer = "A";
        }

        if (A == 2) {
            if (B == 1) answer = "A";
            else if (B == 3) answer = "B";
        }

        if (A == 3) {
            if (B == 1) answer = "B";
            else if (B == 2) answer = "A";
        }

        return answer;
    }

    /**
     * GPT 풀이
     */
    public String Solution2(int A, int B) {
        if (A == B) {
            return "D";
        } else if ((A == 1 && B == 3) ||
                (A == 2 && B == 1) ||
                (A == 3 && B == 2)) {
            return "A";
        } else {
            return "B";
        }
    }

    /**
     * 강의 풀이
     */
    public String Solution3(int A, int B) {
        String answer = "B";

        if (A == B) {
            answer = "D";
        } else if (A == 1 && B == 3) {
            answer = "A";
        } else if (A == 2 && B == 1) {
            answer = "A";
        } else if (A == 3 && B == 2) {
            answer = "A";
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        RockPaperScissors T = new RockPaperScissors();

        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            // System.out.println(T.Solution(A[i], B[i]));
            // System.out.println(T.Solution2(A[i], B[i]));
            System.out.println(T.Solution3(A[i], B[i]));
        }
    }
}
