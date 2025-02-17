package Programers;

/**
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class 문자열의_뒤의_n글자 {
    public static void main(String[] args) {
        문자열의_뒤의_n글자 T = new 문자열의_뒤의_n글자();

        System.out.println(T.solution("ProgrammerS123", 11));
    }

    public String solution(String s, int i) {
        return s.substring(s.length()-i);
    }
}
