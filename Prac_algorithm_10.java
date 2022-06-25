import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Prac_algorithm_10 {
    public Prac_algorithm_10(int[] arr) {
//      링크드 리스트 참고 - 중간에 있는 작은수를 바로 뺄수 있도록 구현필요
//      중간에 있는 작은수를 빼야되기에 정렬은 필요없음
//      [10]일 경우 'return -1'로 반환
//      배열안의 최소값을 찾는것을 우선적으로 생각

//      1차 코드 작성 - 코드 실행은 성공, 제출시 모두 실패가뜸
//        ArrayList<Integer> before_answer= new ArrayList<>();
//
//        if (arr.length == 1) {
//            before_answer.add(-1);
//            int[] answer = before_answer.stream().mapToInt(i -> i).toArray();
//        } else {
//            for (int i = 0; i < arr.length; i++) {
//                try {
//                    if (arr.length == 1) {
//                        before_answer.add(-1);
//                    } else if (arr[i] > arr[i + 1]) {
//                        before_answer.add(arr[i]);
//                    }
//                } catch (Exception e) {
//                    break;
//                }
//            }
//            int[] answer = before_answer.stream().mapToInt(i -> i).toArray();
//        }

//      2차 코드 작성 - 코드 실행은 성공, 제출시 모두 실패가뜸
//      HashMap<>을 이용해서 시도 -
//      value에 0의 값을 넣는경우, key의 값이 null이 되는것 확인

//        Map<Integer, Integer> arrMap = new HashMap<>();
//        ArrayList<Integer> before_answer= new ArrayList<>();
//        int value = 0;
//
//        if (arr.length == 1) {
//            before_answer.add(-1);
//            int[] answer = before_answer.stream().mapToInt(i -> i).toArray();
//            for (int i = 0; i < answer.length; i++) {
//                System.out.println("arr.length = 1 : "+answer[i]);
//            }
//        } else {
//            for(int i = 0; i < arr.length; i++) {
////      containsKey() - HashMap에 인자로 전달된 key가 존재하면 true, 아니면 false
////            System.out.println(arr[i]);
//                arrMap.put(i, arr[i]);
//            }
//            for(int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr.length; j++) {
//                    if (arr[j] < arrMap.get(i) ) {
//                        value = j;
//                    }
//                }
////            System.out.println(arrMap.get(i));
//            }
//            System.out.println("value : "+value);
//            arrMap.remove(value);
//            for (int i = 0; i < arr.length; i++) {
//                if (arrMap.get(i) != null) {
//                    before_answer.add(arrMap.get(i));
//                }
//                System.out.println(arrMap.get(i));
//            }
//            int[] answer = before_answer.stream().mapToInt(i -> i).toArray();
//            for (int i = 0; i < answer.length; i++) {
//                System.out.println(answer[i]);
//            }
//        }

//      3차 코드 작성
//
    }
}
