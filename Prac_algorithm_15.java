import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Prac_algorithm_15 {
    public Prac_algorithm_15(int []arr) {
//      배열 arr의 크기 : 1,000,000 이하의 자연수
//      배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
//      ===============================================================
//      배열의 중복값 제거 - set 사용 불가
//      1. 연속되는 값을 제거하기 위하 조회한 값과 next node 값을 비교
//      2. 두개의 값이 일치할 경우 제거 - ArrayList로 변환하여 동적배열로 처리 필요
//      3. 두개의 값이 일치할 경우, 새로 생성한 ArrayList에 추가 하지 않도록 처리

        ArrayList<Integer> new_arr = new ArrayList<>();
        int count = 0;
        for (int i : arr) {
            if (new_arr.size() == 0) {
                new_arr.add(i);
            } else if (i != new_arr.get(count)) {
                new_arr.add(i);
                count++;
            }
        }
        for (int i : new_arr) {
            System.out.println("i = " + i);
        }

//        1차 코드 작성 : HashSet을 이용해 중복값 제거 - 연속되는 중복값을 제거해야됨으로 set을 사용할 수 없음
//        HashSet<Integer> set = new HashSet<>();
//        for (int i : arr) {
//            set.add(i);
//        }
//
//        int[] answer = new int[set.size()];
//        int i = 0;
//        for (int j : set) {
//            answer[i++] = j;
//        }

//      다른분 풀이
//        ArrayList<Integer> tempList = new ArrayList<Integer>();
//        int preNum = 10;
//        for(int num : arr) {
//            if(preNum != num)
//                tempList.add(num);
//            preNum = num;
//        }
//        int[] answer = new int[tempList.size()];
//        for(int i=0; i<answer.length; i++) {
//            answer[i] = tempList.get(i).intValue();
//        }
    }
}
