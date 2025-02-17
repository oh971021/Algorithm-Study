package InfLearn.Integer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 *
 * 풀이 요약
 * 수를 뒤집고, 소수를 찾는다.
 *           -> 1 ~ N 까지 나눠서 나머지가 0인 경우가 2번 이하인 경우 소수로 정의
 *
 * 수를 뒤집을 때, 스트링으로 변환할 필요가 없다.. 나머지랑 몫을     잘 사용하자 !
 */
public class FlippedPrime {
    /**
     * 문제 풀이
     */
    public int solution(int m) {
        int answer = 0;
        String temp = "";

        // 숫자 뒤집기
        for (int i = String.valueOf(m).length() - 1; i >= 0; i--) {
            temp += String.valueOf(m).charAt(i);
        }

        // 뒤집어진 숫자
        answer = Integer.parseInt(temp);

        // 카운팅 템프 변수
        int cnt = 0;

        // 나머지가 0으로 떨어지는 수가 있으면 카운팅
        for (int i = 2; i < answer; i++) {
            if (answer % i == 0) {
                cnt++;
            }
        }

        // 1은 제외, 나머지가 0으로 떨어지는 수가 2개 이상이면 소수가 아니므로 0을 반환.
        answer = answer > 1 && cnt < 1 ? answer : 0;

        return answer;
    }

    /**
     * 강의 풀이
     */
    public ArrayList<Integer> solution2(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i < n; i++) {
            int temp = arr[i];
            int res = 0;
            while (temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }
            if (isPrime(res)) answer.add(res);
        }

        return answer;
    }

    /**
     * 강의 풀이 + 함수
     */
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        FlippedPrime T = new FlippedPrime();

//        for (int i = 0; i < n; i++) {
//            int answer = T.solution(sc.nextInt());
//            System.out.print(answer > 0 ? answer + " " : "");
//        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : T.solution2(n, arr)) {
            System.out.println(i + " ");
        }
    }
}
