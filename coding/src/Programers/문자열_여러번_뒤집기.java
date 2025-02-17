package Programers;

/**
 * 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
 * queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
 * my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class 문자열_여러번_뒤집기 {
    public String solution(String my_string, int[][] queries) {
        char[] nArr = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            for (int j = s; j <= (s+e)/2; j++) {
                char temp = nArr[j];
                nArr[j] = nArr[s+e-j];
                nArr[s+e-j] = temp;
            }
        }

        return new String(nArr);
    }
    public static void main(String[] args) {
        문자열_여러번_뒤집기 T = new 문자열_여러번_뒤집기();

        int[][] queries = {{2,3}, {0,7}, {5,9}, {6,10}};

        System.out.println(T.solution("rermgorpsam",  queries));
    }
}
