package Programers;

/**
 * 문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class 문자열_뒤집기 {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] nArr = my_string.toCharArray();

//        for (int i = s; i < (s+e)/2; i++) {
//            char temp = nArr[i];
//            nArr[i] = nArr[s+e-i];
//            nArr[s+e-i] = temp;
//        }

        while (s < e) {
            char temp = nArr[s];
            nArr[s] = nArr[e];
            nArr[e] = temp;
            s++;
            e--;
        }

        for (char c : nArr) {
            answer += String.valueOf(c);
        }

        return answer;
    }

    public static void main(String[] args) {
        문자열_뒤집기 T = new 문자열_뒤집기();

        System.out.println(T.solution("Progra21Sremm3",6,12));
    }
}
