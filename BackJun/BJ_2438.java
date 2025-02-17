package BackJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 별찍기
 */
public class BJ_2438 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(bf.readLine());
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        bf.close();
    }
}
