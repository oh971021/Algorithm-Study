package Programers;

/**
 * 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, my_string에서 'A'의 개수,
 * my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, my_string에서 'a'의 개수,
 * my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
 */
public class 문자_개수_세기 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] cArr = my_string.toCharArray();

        for (char c : cArr) {
            if (c >= 97) {
                answer[c - 71]++;
            } else {
                answer[c - 65]++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        문자_개수_세기 T = new 문자_개수_세기();

        for(int i : T.solution("Programmers")) {
            System.out.print(i + " ");
        };

    }
}
