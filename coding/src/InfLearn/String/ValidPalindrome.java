package InfLearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 유효한 팰린드롬
 * 앞에서 읽으나, 뒤에서 읽으나 같은 문자열을 팰린드롬이라 한다.
 * 팰린드롬이면 YES 아니면 NO 출력
 */
public class ValidPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new ValidPalindrome().Solution(bf.readLine().toLowerCase().replaceAll("[^a-z]", "")));
        System.out.println(new ValidPalindrome().Solution2(bf.readLine()));
    }

    public String Solution(String s) {
        return new StringBuilder(s).reverse().toString().equals(s) ? "YES" : "NO";
    }

    public String Solution2(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";
        return answer;
    }
}
