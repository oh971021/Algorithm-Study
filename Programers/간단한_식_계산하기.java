package Programers;

/**
 * 문자열 binomial이 매개변수로 주어집니다.
 * binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다.
 * 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
 */
public class 간단한_식_계산하기 {
    public int solution(String binomial) {
        String[] temp = binomial.split(" ");

        switch (temp[1])
        {
            case "+":
                return Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
            case "-":
                return Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
            default:
                return Integer.parseInt(temp[0]) * Integer.parseInt(temp[2]);
        }
    }

    public static void main(String[] args) {
        간단한_식_계산하기 T = new 간단한_식_계산하기();
        System.out.println(T.solution("43 + 12"));
    }
}
