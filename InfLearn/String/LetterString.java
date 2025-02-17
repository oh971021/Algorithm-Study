package InfLearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 회문 문자열
 * 앞 뒤 뒤집어도 같은 문자면 YES 아니면 NO
 */
public class LetterString {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new LetterString().Solution3(bf.readLine().toLowerCase()));
    }

    /**
     * 전체 문자열 비교
     */
    public String Solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString().equals(s) ? "YES" : "NO";
    }

    /**
     * 문자열을 반으로 잘라서 앞과 뒤 비교
     */
    public String Solution2(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return "NO";
            }
        }
        return "YES";
    }

    /**
     * 문자열 뒤집어서 비교
     * String.reverse() 함수 사용
     */
    public String Solution3(String s) {
        return new StringBuilder(s).reverse().toString().equals(s) ? "YES" : "NO";
    }
}
