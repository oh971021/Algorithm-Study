package InfLearn.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 문자열 압축
 * 문자열을 입력받아, 같은 문자가 연속으로 반복되는 경우 반복 횟수를 표기한다. 반복 횟수가 1인 경우는 생략한다.
 * ex) KKKKSSSSHHHH K4S4H4
 */
public class StringCompression {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(new StringCompression().Solution(br.readLine().toUpperCase()));
        bw.flush();
        bw.close();
    }

    public String Solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;

        // 다음 배열과 비교 후 넣을지 말지 작업한다.
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) { // 다음 배열과 같으면 카운팅
                cnt++;
            } else { // 다음 배열과 다르면 스트링 저장
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }

        return answer;
    }
}
