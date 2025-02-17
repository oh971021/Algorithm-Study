package Programers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후
 * 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
 */
public class 문자열_잘라서_정렬하기 {
    public String[] solution(String myString) {
        String[] temp = myString.split("[x ]+");
        List<String> answer = new ArrayList<>();
        Arrays.sort(temp);
        for (String t : temp) if (!t.equals("")) answer.add(t);
        return answer.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        문자열_잘라서_정렬하기 T = new 문자열_잘라서_정렬하기();

        for(String s : T.solution("dxccxbbbxaaaa")){
            System.out.println(s);
        }
    }
}
