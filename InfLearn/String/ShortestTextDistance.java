package InfLearn.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 최단 텍스트 거리
 * <p>
 * 입 출력 예시)
 * input: teachermode e
 * output: 1 0 1 2 1 0 1 2 2 1 0
 */
public class ShortestTextDistance {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(new ShortestTextDistance().Solution(bf.readLine()));
        //System.out.println(new InfLearn.String.ShortestTextDistance().Solution2(bf.readLine()));

        bw.flush();
        bw.close();
        bf.close();
    }

    public String Solution(String s) throws Exception {
        StringTokenizer st = new StringTokenizer(s);

        char[] c = st.nextToken().toCharArray();
        String t = st.nextToken();

        String answer = "";
        int tmp = 0;

        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < c.length; i++) {
            tmp = t.equals(String.valueOf(c[i])) ? 0 : tmp + 1;
            temp.append(i == 0 ? String.valueOf(Integer.MAX_VALUE) : String.valueOf(tmp));
            temp.append(i != c.length-1 ? " " : "");
        }
        System.out.println(temp);
        String[] sl = temp.toString().split(" ");

        tmp = 0;
        temp.delete(0, temp.length());
        for (int i = c.length-1; i >= 0; i--) {
            tmp = t.equals(String.valueOf(c[i])) ? 0 : tmp + 1;
            temp.append(i == c.length-1 ? t.equals(String.valueOf(c[i])) ? "0" : String.valueOf(Integer.MAX_VALUE) : String.valueOf(tmp));
            temp.append(i != 0 ? " " : "");
        }

        String[] sr = temp.reverse().toString().split(" ");

        for (int i = 0; i < sl.length; i++) {
            answer += Integer.parseInt(sl[i]) < Integer.parseInt(sr[i]) ? sl[i] : sr[i];
            answer += i != sl.length-1 ? " " : "";
        }

        return answer;
    }

    public String Solution2(String s) {
        StringTokenizer st = new StringTokenizer(s);

        s = st.nextToken();
        String t = st.nextToken();

        int[] temp = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            p = t.equals(String.valueOf(s.charAt(i))) ? 0 : p+1;
            temp[i] = p;
        }
        p = 1000;
        for (int i = s.length()-1; i >= 0; i--) {
            p = t.equals(String.valueOf(s.charAt(i))) ? 0 : p+1;
            temp[i] = Math.min(temp[i], p);
        }

        String answer = "";

        for(int x : temp) {
            answer += x + " ";
        }

        return answer;
    }
}
