package Programers;

public class 홀수vs짝수 {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }

        return Integer.max(even,odd);
    }

    public static void main(String[] args) {
        홀수vs짝수 T = new 홀수vs짝수();

        System.out.println(T.solution(new int[]{4,2,6,1,7,6}));
    }
}
