package BackJun;

import java.io.*;
import java.util.StringTokenizer;

/**
 * X보다 작은 수
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */
public class BJ_10871 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; String result = "";

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int minVal = 0;
        int maxVal = 0;

        for (int i = 0; i < arrN.length - 1; i++) {

        }

        System.out.println(minVal);
        System.out.println(maxVal);

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
