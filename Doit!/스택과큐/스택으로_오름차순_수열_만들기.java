package Doit.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 백준 1874
 *
 * 임의의 수영를 스택에 넣었다가 출력하는 방식, 오름차순 수열을 출력할 수 있는지 확인하고,
 * 출력할 수 있다면 puhs와 pop 연산을 어떤 순서로 수행해야 하는지 알아내는 프로그램을 작성해보자.
 *
 *  입력: 1번째 줄에 수열의 개수 n(1 <= n <= 100,000)이 주어진다.
 *       두번째 줄에서 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 1개씩 순서대로 주어진다.
 *       이때 같은 정수가 두 번 이상 나오지는 않는다.
 *  출력: 오름차순 수열을 만들기 위한 연산순서를 출력한다.
 *       push 연산은 +, pop 연산은 -로 출력하고, 불가능할 때는 NO를 출력한다.
 *
 *  예제
 *  8 // 수열의 개수
 *  4 3 6 8 7 5 2 1
 *  + + + + - - + + - + + - - - - -
 *
 *  5
 *  5 1 2 5 3 4
 *  NO
 * */
public class 스택으로_오름차순_수열_만들기  {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int len = Integer.parseInt(st.nextToken());
        int[] arr = new int[len];

        for (int i=0; i<len; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            arr[i] = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        }

        스택으로_오름차순_수열_만들기 obj = new 스택으로_오름차순_수열_만들기();
        // obj.mySolution(len, arr);
        obj.eduSolution(len, arr);
    }

    public void eduSolution(int n, int[] arr) {
        int num = 1;
        boolean result = true;
        StringBuilder sb = new StringBuilder();
        // 스택 선언해서 사용..
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<n; i++) {
            int now = arr[i];
            if (now >= num) { // 수열의 값이 오름차순 값 보다 크거나 같은 경우
                while (now >= num) { // 같을 때 까지 오름차순 값 대입
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop(); // 같으면 pop하고 탈출
                sb.append("-\n");
            } else { // 오름차순 값이 수열보다 큰 경우
                int top = stack.pop(); // 현재 top값 확인 후 top 값 삭제
                if (now <= top) { // 수열의 값이 top 보다 작거나 같은 경우
                    sb.append("-\n");
                } else { // top이 수열의 값보다 큰 경우
                    System.out.println("NO");
                    result = false;
                    break;
                }
            }
        }
        if (result) System.out.println(sb.toString());
    }

    public String mySolution(int n, int[] arr) {
        int top = 0;
        String result = "";
        for (int i=0; i<n; i++) {
            // top이 수열의 값보다 크거나 같은 경우
            if (arr[i] >= top) {
                while (true) {
                    // 수열의 값과 top이 같으면 탈출
                    if (arr[i] == top) {
                        top--;
                        result += "-";
                        break;
                    }

                    // 오름차순 값 대입
                    top++;
                    result += "+";
                }
            } else {
                while(true) {
                    // 수열의 값과 top이 같으면 탈출
                    if (arr[i] == top)
                        break;

                    if (arr[i] < top) {
                        top--;
                        result += "-";
                    } // .... ?
                }
            }
        }

        return result;
    }
}

// 1 .. 2 .. 3 .. 4 .. 4 .. 5 .. 6 .. 6 .. 7 .. 8 .. 8 .. 7 .. 5 .. 4 .. 3 .. 2 .. 1
// + + + + - + + - + + - - - - - - -