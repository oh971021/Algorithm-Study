package InfLearn.Integer;

import java.util.Scanner;

/**
 * 보이는 학생
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 *
 * 풀이 요약
 * 학생의 키를 순차적으로 확인하면서 현재까지의 최대 높이를 저장하고,
 * 현재 학생의 키가 최대 높이보다 크다면 보이는 학생으로 간주한다.
 * @Greedy 접근 방식
 */
public class VisibleStudent {
    /**
     * 문제 풀이
     */
    public int Solution(int[] args) {
        int answer = 1;

        for (int i = 0; i < args.length; i++) {
            int cnt = 0;
            for (int j = 0; j < i; j++) {
                if (args[i] <= args[j]) {
                    cnt = 0;
                    break;
                } else {
                    cnt++;
                }
            }
            answer += cnt >= 1 ? 1 : 0;
        }

        return answer;
    }

    /**
     * GPT 풀이
     */
    public int Solution2(int[] args) {
        int answer = 1;
        int maxHeight = args[0];

        for (int i = 1; i < args.length; i++) {
            if (args[i] > maxHeight) {
                answer++;
                maxHeight = args[i];
            }
        }

        return answer;
    }

    /**
     * 강의 풀이
     */
    public int Solution3(int[] args) {
        int answer = 1;
        int max = args[0];

        for (int i = 1; i < args.length; i++) {
            if (max < args[i]) {
                answer++;
                max = args[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        VisibleStudent T = new VisibleStudent();

        // N (5 <= N <= 1000)
        int N = sc.nextInt();

        // List[N]
        int[] Students = new int[N];
        for (int i = 0; i < N; i++) {
            Students[i] = sc.nextInt();
        }

        // System.out.println(T.Solution(Students));
        // System.out.println(T.Solution2(Students));
        System.out.println(T.Solution3(Students));
    }
}
