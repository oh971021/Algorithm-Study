package Programers;

/**
 * 문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고,
 * "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
 */
public class A_강조하기 {
    public String solution(String myString) {
        String answer = "";
        char[] nArr = myString.toLowerCase().toCharArray();

        for (int i = 0; i < nArr.length; i++) {
            if (nArr[i] == 'a')
                nArr[i] = (char)(nArr[i] - 32);

            answer += String.valueOf(nArr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        A_강조하기 T = new A_강조하기();

        System.out.println(T.solution("abstract algebra"));
    }
}
