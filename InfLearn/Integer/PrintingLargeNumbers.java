package InfLearn.Integer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * 큰 수 출력하기
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 *
 * input
 * 6
 * 7 3 9 5 6 12
 *
 * output
 * 7 9 6 12
 */
public class PrintingLargeNumbers {
    /**
     * 선 풀이
     */
    public String Solution(int N, String Ns) {
        String answer = "";

        String[] Temp = Ns.split(" ");

        answer += Temp[0] + " ";
        for (int i = 1; i < N; i++) {
            answer += Integer.parseInt(Temp[i]) > Integer.parseInt(Temp[i - 1]) ? Temp[i] + " " : "";
        }

        return answer;
    }

    /**
     * 강의 풀이
     */
    public ArrayList<Integer> Solution2(int N, int[] Ns) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(Ns[00]);

        for (int i = 1; i < N; i++) {
            if (Ns[i] > Ns[i-1]) answer.add(Ns[i]);
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PrintingLargeNumbers T = new PrintingLargeNumbers();

        /**
         * Solution
         */
//        int N = Integer.parseInt(br.readLine());
//        String Ns = br.readLine();
//        bw.write(T.Solution(N, Ns));

        /**
         * Solution2
         */
        int N = Integer.parseInt(br.readLine());
        int[] Ns = new int[N];
        for (int i = 0; i < N; i++) {
            Ns[i] = Integer.parseInt(br.readLine());
        }
        for (int i : T.Solution2(N, Ns)) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
    }
}
