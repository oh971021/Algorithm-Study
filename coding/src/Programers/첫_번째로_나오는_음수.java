package Programers;

public class 첫_번째로_나오는_음수 {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) if (num_list[i] < 0) return i;
        return -1;
    }

    public static void main(String[] args) {
        첫_번째로_나오는_음수 T = new 첫_번째로_나오는_음수();

        System.out.println(T.solution(new int[]{12, 4, 15, 46, 38, -2, 15}));
    }
}
