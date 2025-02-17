package BackJun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 * 별찍기2
 */
public class BJ_2439 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = 0; j <= i; j++) {
                temp += "*";
            }
            System.out.println(String.format("%"+n+"s", temp));
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
