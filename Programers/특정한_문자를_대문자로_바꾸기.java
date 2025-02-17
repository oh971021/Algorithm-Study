package Programers;

public class 특정한_문자를_대문자로_바꾸기 {
    public String solution(String my_string, String alp) {
        String answer = "";
        char[] nArr = my_string.toLowerCase().toCharArray();

        for (int i = 0; i < nArr.length; i++) {
            if (String.valueOf(nArr[i]).equals(alp))
                nArr[i] = (char)(nArr[i] - 32);

            answer += String.valueOf(nArr[i]);
        }

        return answer;
    }

    public String solution2(String my_string, String alp) {
        return my_string.toLowerCase().replace(alp, alp.toUpperCase());
    }

    public static void main(String[] args) {
        특정한_문자를_대문자로_바꾸기 T = new 특정한_문자를_대문자로_바꾸기();

        System.out.println(T.solution2("programmers", "p"));
    }
}
