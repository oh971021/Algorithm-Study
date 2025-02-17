package Programers;

public class 부분_문자열_이어_붙여_문자열_만들기 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i].substring(parts[i][0],parts[i][1]+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        부분_문자열_이어_붙여_문자열_만들기 T = new 부분_문자열_이어_붙여_문자열_만들기();

        String[] s = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] i = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

        T.solution(s, i);
    }
}
