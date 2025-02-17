package InfLearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자만 추출
 * 문자열이 들어오면 그 문자열의 숫자만 출력한다.
 */
public class ExtractNumbersOnly {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new ExtractNumbersOnly().Solution3(bf.readLine()));
    }

    public int Solution(String s) {
        return Integer.parseInt(s.replaceAll("[^0-9]", ""));
    }

    public int Solution2(String s) {
        int answer = 0;
        char[] c = s.toCharArray();
        for (char i : c) {
            if (i >= 48 && i <= 57) answer = answer * 10 + (i - 48);
        }
        return answer;
    }

    public int Solution3(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }
}
