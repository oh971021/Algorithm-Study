package InfLearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 중복 제거
 * 소문자 문자열에서 중복을 제거하고 출력
 */
public class RemoveDuiplicateCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new RemoveDuiplicateCharacters().Solution2(bf.readLine()));
    }

    public String Solution(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char i : c) {
            if (sb.indexOf(String.valueOf(i)) < 0)
                sb.append(i);
        }

        return sb.toString();
    }

    public String Solution2(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            answer += s.indexOf(s.charAt(i)) == i ? s.charAt(i) : "";
        }
        return answer;
    }
}
