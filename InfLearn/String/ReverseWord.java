package InfLearn.String;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {
    public String solution(String[] args) {
        String answer = "";

        for (String s : args) {
            answer = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                answer += s.charAt(i);
            }
            // System.out.println(answer);
        }
        return answer;
    }

    public ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;

            while(lt < rt) {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;

                lt++;
                rt--;
            }

            String temp = String.valueOf(s);

            answer.add(temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        ReverseWord T = new ReverseWord();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.next();
        }

        // T.solution(arr);

        for (String x : T.solution2(num, arr)) {
            System.out.println(x);
        }
    }
}
