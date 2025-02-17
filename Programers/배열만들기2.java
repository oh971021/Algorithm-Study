package Programers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 배열만들기2 {
    public int[] Solution(int l, int r) {
        List<Integer> temp = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            int cnt = 0;
            if (i % 5 == 0) {
                char[] nArr = String.valueOf(i).toCharArray();
                for (char c : nArr) {
                    if (c == '5' || c == '0') cnt++;
                }
                if (nArr.length == cnt) temp.add(i);
            }
        }

        // int로 변환해주는 스트림 메소드
        int[] answer = temp.stream().mapToInt(i->i).toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        배열만들기2 T = new 배열만들기2();

        for (int s:T.Solution(5, 555)) {
            System.out.println(s);
        };
    }
}