package BackJun;

import java.util.Scanner;

/**
 * 백준 25314
 * 코딩은 체육과목입니다.
 * - 정수 N이 주어진다.
 * - 정수 자료형은 4Byte 까지 저장할 수 있다.
 * - N 바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하라.
 */
public class BJ_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt() / 4;
        String temp = "";
        for (int i = 0; i < b; i++) {
            temp += "long ";
        }
        System.out.println(temp + "int");
    }
}
