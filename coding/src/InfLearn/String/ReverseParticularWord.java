package InfLearn.String;

import java.util.Scanner;

public class ReverseParticularWord {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while(lt < rt) {
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;

                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s);

        return answer;
    }
    public static void main(String[] args) {
        ReverseParticularWord T = new ReverseParticularWord();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(T.solution(input));
    }
}
