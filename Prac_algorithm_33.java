import java.util.ArrayList;
import java.util.HashMap;

public class Prac_algorithm_33 {
    public Prac_algorithm_33(int n, int[] lost, int[] reserve) {
//      탐욕(그리디) 알고리즘(greedy algorithm) - 미래를 생각하지 않고 당장 최선의 결과값을 생각하는 알고리즘
//      전체 학생의 수는 2명 이상 30명 이하입니다.
//      체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
//      여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
//      여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
//      여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다. - 중요조건
//      ======================================================
//      체육복이 없는 학생은 수업을 들을수 없으므로, 제외
//      학생수 2 ~ 30 사이의 값
//      n = 학생수 , lost - 도난당한 학생 번호, reserve - 여벌을 가지고 온 학생 번호
//      여벌의 학생이 도난 당했을 경우 꼭 생각해야됨
//      여벌을 가지고있는 학생 번호 앞, 뒤의 번호만 빌려줄 수 있음
//      reserve 배열을 이용해 빌려줄수 있는 번호를 추출
//      여벌은 1벌만 빌려줄수 있으므로, 한번 빌려줬을경우 더 이상 빌려줄수없는 상태로 변경 피룡
//      HashMap 사용 필요

        HashMap<Integer, Integer> lend_num = new HashMap<>();
        int count = 0;
        for (int i : reserve) {
//          lend_num에 i-1의 값이 없거나, i-1이 0의 값보다 클 경우 - 학생수는 1명 이상이기에 i-1 = 0이 되는거 방지
            if (i-1 > 0 && !lend_num.containsKey(i-1)) {
                if (lend_num.get(i-1) == null || lend_num.get(i-1) == 0) {
                    lend_num.put(i-1,1);
                    count++;
                }
            } else if (lend_num.containsKey(i-1)){
                lend_num.put(i-1,(lend_num.get(i-1)+1));
                count++;
            }
//          lend_nem에 i+1의 값이 없거나, i+1이 학생수보다 작거나 같을 경우
            if (i+1 <= n && !lend_num.containsKey(i+1)) {
                if (lend_num.get(i+1) == null || lend_num.get(i+1) == 0) {
                    lend_num.put(i+1,1);
                    count++;
                }
            } else if (lend_num.containsKey(i+1)){
                lend_num.put(i+1,(lend_num.get(i+1)+1));
                count++;
            }
        }
        System.out.println("lend_num = " + lend_num);

        int lend_student = 0;
//        int cannot_lend = 0;
        for (int j : lost) {
            if (lend_num.containsKey(j)) {
                if (lend_num.get(j) > 0) {
                    lend_student++;
                    lend_num.put(j, lend_num.get(j)-1);
                    if (lend_num.get(j+2) != null) {
                        lend_num.put(j+2, lend_num.get(j+2)-1);
                    }
                }
            }
        }
        System.out.println("lend_num = " + lend_num);
//
//
        System.out.println("lend_student = " + lend_student);
        int answer = n - lost.length + lend_student;
        System.out.println("answer = " + answer);
    }
}

//    1차 코드 작성 - 중복되는 값 처리 불가
//    ArrayList<Integer> lend_num = new ArrayList<>();
//    int count = 0;
//        for (int i : reserve) {
////            if (count == 0 && i-1 > 0) {
////                lend_num.add(i-1);
////            }
////          lend_num에 i-1의 값이 없거나, i-1이 0의 값보다 클 경우 - 학생수는 1명 이상이기에 i-1 = 0이 되는거 방지
//                if (i-1 > 0 && !lend_num.contains(i-1)) {
//                lend_num.add(i-1);
//                count++;
//                }
////          lend_nem에 i+1의 값이 없거나, i+1이 학생수보다 작거나 같을 경우
//                if (i+1 <= n && !lend_num.contains(i+1)) {
//                lend_num.add(i+1);
//                count++;
//                }
//                }
//                System.out.println("lend_num = " + lend_num);
//                int lend_student = 0;
//                int cannot_lend = 0;
//                for (int j : lost) {
//                if (lend_num.contains(j) && j != cannot_lend) {
//                cannot_lend = j+2;
//                lend_student++;
//                }
//                }
//
//
//                System.out.println("lend_student = " + lend_student);
//                int answer = n - lost.length + lend_student;
//                System.out.println("answer = " + answer);
