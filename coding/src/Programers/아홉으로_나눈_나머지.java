package Programers;

public class 아홉으로_나눈_나머지 {
    public int solution(String number) {
        int answer = 0;
        char[] cArr = number.toCharArray();

        for (char c : cArr) {
            answer += Integer.parseInt(String.valueOf(c));
        }

        return answer % 9;
    }

    public static void main(String[] args) {
        아홉으로_나눈_나머지 T = new 아홉으로_나눈_나머지();

        System.out.println(T.solution("123"));
    }
}
