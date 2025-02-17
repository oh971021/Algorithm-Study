package Programers;

/**
 * 문자열 배열 strArr이 주어집니다.
 * strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 1 ≤ strArr의 길이 ≤ 100,000
 * 1 ≤ strArr의 원소의 길이 ≤ 30
 * strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
 */
public class 문자열_묶기 {
    public int solution(String[] strArr) {
        int answer = Integer.MIN_VALUE;
        int[] intArr = new int[31];

        for (int i = 0; i < strArr.length; i++) {
            intArr[strArr[i].length()]++;
        }

        for (int i : intArr) {
            if (i > answer) answer = i;
        }

        return answer;
    }

    public static void main(String[] args) {
        문자열_묶기 T = new 문자열_묶기();

        System.out.println(T.solution(new String[]{"a","bc","d","efg","hi"}));
    }
}
