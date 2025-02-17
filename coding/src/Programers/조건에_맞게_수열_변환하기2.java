package Programers;

import java.util.Arrays;

/**
 * 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.
 * 이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때, arr(x) = arr(x + 1)인 x가 항상 존재합니다. 이러한 x 중 가장 작은 값을 return 하는 solution 함수를 완성해 주세요.
 * 단, 두 배열에 대한 "="는 두 배열의 크기가 서로 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미합니다.
 */
public class 조건에_맞게_수열_변환하기2 {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        int[] newArr = new int[arr.length];

        while(count != arr.length){
            count = 0;
            newArr = arr.clone();

            for(int i=0; i<arr.length; i++){
                if(arr[i]%2==0&&arr[i]>=50){
                    arr[i] /= 2;
                }else if(arr[i]%2!=0&&arr[i]<50){
                    arr[i] = arr[i] * 2 + 1;
                }
                if(arr[i] == newArr[i]){
                    count++;
                }
            }
            answer++;
        }

        return answer-1;
    }

    public static void main(String[] args) {
        조건에_맞게_수열_변환하기2 T = new 조건에_맞게_수열_변환하기2();

        System.out.println(T.solution(new int[] {1,2,3,100,99,98}));
    }
}
