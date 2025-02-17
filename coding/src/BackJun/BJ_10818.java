package BackJun;

import java.util.Scanner;

/**
 * 최소, 최대
 *
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 풀이 요약
 * 그리디 알고리즘~
 */
public class BJ_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxValue = sc.nextInt();
        int maxCode = 1;
        int chk;

        for (int i = 1; i < 9; i++) {
            chk = sc.nextInt();
            if (maxValue < chk) {
                maxValue = chk;
                maxCode = i + 1;
            }
        }

        System.out.println(maxValue + "\n" + maxCode);
    }
}
