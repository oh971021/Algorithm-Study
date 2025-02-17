package InfLearn.Integer;

import java.util.Scanner;

/**
 * 봉우리
 *
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
 *
 * 풀이 요약
 *  사방으로 비교해보고 맞으면 ++
 *
 * 고칠 점
 *  팔방으로 비교하는 문제에서 if문을 사용하면 성능상 문제가 있을 수 있다.. (모두 비교하기때문)
 *  0으로 감싸는 건 가정일 뿐, 실제로 감싸지 않고 처리한다 (x >= 0 && x < n && y >= 0 y < n) 을 비교문 앞에 배치한다.
 */
public class Peaks {
    /**
     * 문제 풀이
     */
    public int solution(int n, int[][] nArr) {
        int answer = 0;

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (nArr[i][j] > nArr[i-1][j] && nArr[i][j] > nArr[i][j-1] && // 상 좌
                    nArr[i][j] > nArr[i+1][j] && nArr[i][j] > nArr[i][j+1])   // 하 우
                answer++;
            }
        }

        return answer;
    }

    /**
     * 강의 풀이
     */
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution2(int n, int[][] nArr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;

                // 좌표 설정
                for (int k = 0; k < 4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && nArr[nx][ny] >= nArr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Peaks T = new Peaks();
        int n = sc.nextInt();

//        int[][] nArr = new int[n+2][n+2];
//        for (int i = 1; i < n+1; i++) {
//            for (int j = 1; j < n+1; j++) {
//                nArr[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println(T.solution(n, nArr));

        int[][] nArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution2(n, nArr));
    }
}
