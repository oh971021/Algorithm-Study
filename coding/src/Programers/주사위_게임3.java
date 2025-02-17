package Programers;

/**
 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
     * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
     * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
     * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
     * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
     * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 */
public class 주사위_게임3 {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        int[] temp = new int[4];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(i!=j && arr[i] == arr[j]) {
                    temp[i]++;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = 0; i < 4; i++) {
            if(temp[i] < min) {
                min = temp[i];
                minIndex = i;
            }
            if(temp[i] > max) {
                max = temp[i];
                maxIndex = i;
            }
        }

        String chkValue = String.valueOf(min)+String.valueOf(max);
        int answer = 0, calc;

        if (chkValue.equals("33")) {
            answer = 1111 * arr[maxIndex];
        } else if (chkValue.equals("02")) {
            answer = 10 * arr[maxIndex] + arr[minIndex];
            answer *= answer;
        } else if (chkValue.equals("11")) {
            calc = arr[maxIndex];
            for (int i = 0; i < 4; i++) {
                if (calc != arr[i]) {
                    calc = arr[i];
                    break;
                }
            }
            answer = (arr[minIndex] + calc) * (arr[minIndex] - calc);
            if (answer < 0) {
                answer *= -1;
            }
        } else if (chkValue.equals("01")) {
            calc = 1;
            for (int i = 0; i < 4; i++) {
                if (arr[i] != arr[maxIndex]) {
                    calc *= arr[i];
                }
            }
            answer = calc;
        } else if (chkValue.equals("00")) {
            calc = Integer.MAX_VALUE;
            for (int i = 0; i < 4; i++) {
                if (arr[i] < calc) {
                    calc = arr[i];
                }
            }
            answer = calc;
        }
        return answer;
    }

    public static void main(String[] args) {
        주사위_게임3 T = new 주사위_게임3();

//        System.out.println(T.solution(2,2,2,2)); // 30 30
//        System.out.println(T.solution(4,4,4,1)); // 01 20
//        System.out.println(T.solution(6,3,3,6)); // 10 10
//        System.out.println(T.solution(2,5,2,6)); // 01 10
//        System.out.println(T.solution(1,2,2,3)); // 01 10
//        System.out.println(T.solution(6,4,2,5)); // 00 00
//        System.out.println(T.solution(2,2,4,4)); // 00 00
//        System.out.println(T.solution(1,1,4,1)); // 00 00
//        System.out.println(T.solution(5,4,6,6)); // 00 00
    }
}
