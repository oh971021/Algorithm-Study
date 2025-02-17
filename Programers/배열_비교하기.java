package Programers;

/**
 * 이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
 *
 * 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
 * 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
 * 두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.
 */
public class 배열_비교하기 {
    public int solution(int[] arr1, int[] arr2) {
        int lenArr1 = arr1.length, lenArr2 = arr2.length;
        if (lenArr1 > lenArr2) return 1;
        else if (lenArr1 < lenArr2) return -1;
        int sumArr1 = 0, sumArr2 = 0;
        for (int i = 0; i < lenArr1; i++) {
            sumArr1 += arr1[i];
            sumArr2 += arr2[i];
        }
        return sumArr1 == sumArr2 ? 0 : (sumArr1 > sumArr2) ? 1 : -1;
    }

    public static void main(String[] args) {
        배열_비교하기 T = new 배열_비교하기();

        System.out.println(T.solution(new int[]{49,13}, new int[]{70,11,2}));
    }
}
