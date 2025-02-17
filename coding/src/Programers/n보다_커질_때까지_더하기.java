package Programers;

/**
 * 정수 배열 numbers와 정수 n이 매개변수로 주어집니다.
 * numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
 */
public class n보다_커질_때까지_더하기 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int idx = 0;
        while (answer <= n)
            answer += numbers[idx++];

        return answer;
    }

    public static void main(String[] args) {
        n보다_커질_때까지_더하기 T = new n보다_커질_때까지_더하기();

        System.out.println(T.solution(new int[]{34,5,71,29,100,34}, 123));
    }
}
