import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Prac_algorithm_16 {
    public Prac_algorithm_16(int[] numbers) {
//        numbers의 길이는 2 이상 100 이하입니다.
//        numbers의 모든 수는 0 이상 100 이하입니다.
//        ==============================================
//        정렬 진행후 선택정렬 필요
//        더한값이 중복이 될 경우 추가 필요 없음
//        중복값 제거후 오름차순으로 정렬
        

//      1차 코드 작성 - 코드 실행 통과 , 제출시 일부 테스트 실패
//        HashSet<Integer> sum_list = new HashSet<>();
//        for(int i =0; i<numbers.length; i++) {
//            for(int j = i+1; j< numbers.length; j++) {
//                sum_list.add(numbers[i]+ numbers[j]);
//            }
//        }
//        int[] answer = new int[sum_list.size()];
//        int count = 0;
//        for (int i : sum_list) {
//            answer[count++] = i;
//        }

//      2차 코드 작성
        ArrayList<Integer> sum_list = new ArrayList<>();
        for(int i =0; i<numbers.length; i++) {
            for(int j = i+1; j< numbers.length; j++) {
                if (sum_list.size() == 0) {
                    sum_list.add(numbers[i]+ numbers[j]);
                } else if (!sum_list.contains(numbers[i]+ numbers[j])) {
                    sum_list.add(numbers[i]+ numbers[j]);
                }
            }
        }
        Collections.sort(sum_list);
        int[] answer = new int[sum_list.size()];
        int count = 0;
        for (int i : sum_list) {
            answer[count++] = i;
            System.out.println("i = " + i);
        }
    }

//    다른분 풀이
//
//    Set<Integer> set = new HashSet<>();
//
//    for(int i=0; i<numbers.length; i++) {
//        for(int j=i+1; j<numbers.length; j++) {
//            set.add(numbers[i] + numbers[j]);
//        }
//    }
//
//    return set.stream().sorted().mapToInt(Integer::intValue).toArray();
}
