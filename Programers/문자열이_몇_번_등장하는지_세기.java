package Programers;

/**
 * 문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
 */
public class 문자열이_몇_번_등장하는지_세기 {
    public int solution(String myString, String pat) {
        int answer = 0;

        String temp = myString;
        for (int i = 0; i < myString.length(); i++) {
            int n = temp.indexOf(pat);
            temp = temp.substring(n+1, temp.length());
            if (n > -1) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        문자열이_몇_번_등장하는지_세기 T = new 문자열이_몇_번_등장하는지_세기();

        System.out.println(T.solution("banana", "ana"));
    }
}
