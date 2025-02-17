package BackJun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * A+B - 4
 */
public class BJ_10951 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String eof = "";
        while ((eof = bf.readLine()) != null) {
            st = new StringTokenizer(eof, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            bw.write(x+y+"\n");
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
