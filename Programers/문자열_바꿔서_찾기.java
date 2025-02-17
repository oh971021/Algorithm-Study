package Programers;

/**
 * A는 B로, B는 A로 바꾼 후, 문자열에 pat이 있는지 확인한다.
 * 있으면 1을 없으면 0을 반환한다.
 */
public class 문자열_바꿔서_찾기 {
    public int solution(String myString, String pat) {
        return myString.replace("A", "b").replace("B","A").replace("b","B").contains(pat) ? 1 : 0;
    }

    public static void main(String[] args) {
        문자열_바꿔서_찾기 T = new 문자열_바꿔서_찾기();

        System.out.println(T.solution("ABBAA", "AABB"));
    }
}
