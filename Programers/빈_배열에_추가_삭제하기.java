package Programers;

import java.util.ArrayList;
import java.util.List;

public class 빈_배열에_추가_삭제하기 {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            int cnt = 0;
            if (flag[i]) {
                while (cnt < arr[i] * 2) {
                    answer.add(arr[i]);
                    cnt++;
                }
            } else {
                while (cnt < arr[i]) {
                    answer.remove(answer.size()-1);
                    cnt++;
                }
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        빈_배열에_추가_삭제하기 T = new 빈_배열에_추가_삭제하기();

        for (int i : T.solution(new int[]{3,2,4,1,3}, new boolean[]{true, false, true, false, false})) {
            System.out.println(i);
        };
    }
}
