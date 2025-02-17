package Programers;

/**
 * 문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
 */
public class 세로_읽기 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int len = my_string.length() / m;

        while (len > 0) {
            answer += String.valueOf(my_string.substring(0, m).charAt(c - 1));
            my_string = my_string.substring(m);
            len--;
        }

        return answer;
    }

    public static void main(String[] args) {
        세로_읽기 T = new 세로_읽기();

        T.solution("ihrhbakrfpndopljhygc",4,2);
    }
}
