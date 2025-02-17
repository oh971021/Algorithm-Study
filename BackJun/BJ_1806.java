package BackJun;

import com.sun.jdi.IntegerType;

import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 1806_부분합
 *
 * 10,000 이하의 자연수로 이루어진 길이 N짜리 수열이 주어진다. 이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하는 프로그램을 작성하시오.
 *
 *  입력 : 첫째 줄에 N (10 ≤ N < 100,000)과 S (0 < S ≤ 100,000,000)가 주어진다. 둘째 줄에는 수열이 주어진다. 수열의 각 원소는 공백으로 구분되어져 있으며, 10,000이하의 자연수이다.
 *  출력 : 첫째 줄에 구하고자 하는 최소의 길이를 출력한다. 만일 그러한 합을 만드는 것이 불가능하다면 0을 출력하면 된다.
 *
 *  예제
 *  10 15
 *  5 1 3 5 10 7 4 9 2 8
 *
 *  10 10
 *  2 1 3 5 9 1 2 8 2 1
 * */
public class BJ_1806 {
    public int Solution(int n, int s, int[] arr) {
        int sp = 0;
        int ep = 0;
        int minLength = Integer.MAX_VALUE;

        int sum = 0;

        while (ep < n) {
            sum += arr[ep];
            ep++;

            while (sum >= s) {
                minLength = Math.min(minLength, ep - sp);
                sum -= arr[sp];
                sp++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 수열의 길이
        int n = Integer.parseInt(st.nextToken());
        // 부분합
        int s = Integer.parseInt(st.nextToken());

        // 수열
        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine());

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        BJ_1806 bj = new BJ_1806();
        System.out.println(bj.Solution(n, s, arr));
    }
}
