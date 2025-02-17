package InfLearn.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 * 암호
 * 읽곱자리의 이진수로 바꾼 후 아스키 번호로 확인 한다.
 * #은 이진수 1
 * *은 이진수 0
 * ex) #****## : C
 */
public class Cryptogram {
    /**
     * 선 풀이
     */
    public String Solution(int len, String arg) {
        String answer = "";
        String temp = "";

        for (int i = 0; i < arg.length(); i++) {
            temp += arg.charAt(i) == '#' ? 1 : 0;
        }

        int startNum = 0;
        int endNum = 7;
        String[] arrTemp = new String[len];

        for (int i = 0; i < len; i++) {
            arrTemp[i] = temp.substring(startNum, endNum);
            answer += (char)Integer.parseInt(arrTemp[i], 2);

            startNum += 7;
            endNum += 7;
        }

        return answer;
    }

    /**
     * 강의 풀이
     */
    public String Solution2(int len, String arg) {
        String answer = "";

        for (int i = 0; i < len; i++) {
            answer += (char)Integer.parseInt(arg.substring(0, 7).replace('#', '1').replace('*', '0'), 2);
            arg = arg.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Cryptogram cryptogram = new Cryptogram();

        bw.write(cryptogram.Solution(Integer.parseInt(br.readLine()), br.readLine()));
        bw.flush();
        bw.close();
    }
}
