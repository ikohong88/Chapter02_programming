import java.util.ArrayList;
import java.util.Collections;

public class Prac_algorithm_14 {
    public Prac_algorithm_14(int[][] sizes) {
//      sizes의 길이는 1 이상 10,000 이하입니다.
//      sizes의 원소는 [w, h] 형식입니다.
//      w는 명함의 가로 길이를 나타냅니다.
//      h는 명함의 세로 길이를 나타냅니다.
//      w와 h는 1 이상 1,000 이하인 자연수입니다
//      ==========================================================
//      시간 복잡도를 개선하기 위해서 for, while문의 최소로 사용할것
//      반복문안에 조건문, 대입 연산자도 최소화, 단 반복문 밖에서는 크게 상관없을듯
//      병합 정렬 혹은 2차원 배열에서 최대값과 최소값을 곱하는 방법
//      병합 정렬 사용할 볼것
//      병합 정렬을 사용한 다음, 배열의 가운데 2개의 값을 곱해서 결과값으로 반환
//      merge_sort 코드 구현을 통해 분리 후 병합 정렬 시도

//      해결 필요 - 일부 테스트 실패
        ArrayList<Integer> merge = new ArrayList<>();

        for (int i[] : sizes) {
            for (int j : i) {
                merge.add(j);
            }
        }
        Collections.sort(merge);
        int max_num = merge.get(merge.size()-1);
        int max_num2 = merge.get((merge.size()-1)/2);

        int answer = max_num * max_num2;
        System.out.println("answer = " + answer + " max_num : "+max_num+" max_num2 : "+max_num2);

//        1차 코드 구현 : max_num 구현은 쉬웠으니, 2번째 값을 구하는 코드 작성 실패 - 최소값을 구하면 안됨

//        int max_num = sizes[0][0];
//        int max_num2 = sizes[0][1];
//
//        for (int j[] : sizes) {
//            if (j[0] > max_num) {
//                max_num = j[0];
//            }
//            for (int i : j) {
//                if (i < max_num2) {
//                    max_num2 = i;
//                }
//            }
//        }

//      다른 사람 풀이 - 조원 풀이
//        int maxBigger = 0;
//        int maxSmaller = 0;
//
//        for (int i = 0; i<sizes.length; i++) {
//            if (sizes[i][0]>sizes[i][1]) {
//                if(maxBigger < sizes[i][0]) maxBigger = sizes[i][0];
//                if(maxSmaller < sizes[i][1]) maxSmaller = sizes[i][1];
//            } else {
//                if(maxBigger < sizes[i][0]) maxBigger = sizes[i][1];
//                if(maxSmaller < sizes[i][1]) maxSmaller = sizes[i][0];
//            }
//        }
    }
}
