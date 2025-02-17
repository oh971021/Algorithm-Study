package Programers;

public class 공_던지기 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 0;

        while (k > cnt++) {
            for (int i = 0; i < numbers.length; i += 2) {
                System.out.println(numbers[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        공_던지기 T = new 공_던지기();

//        T.solution(new int[]{1,2,3,4}, 2);
//        T.solution(new int[]{1,2,3,4,5,6}, 5);
//        T.solution(new int[]{1,2,3}, 3);
    }
}
