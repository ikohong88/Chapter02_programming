import java.util.*;
import java.util.stream.IntStream;

public class Prac_algorithm_18 {
    public Prac_algorithm_18(int[] answers) {
//      answers 배열안에 정답이 있음
//      시험은 최대 10,000 문제로 구성되어있습니다.
//      문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//      가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
//      수포자 인원 3명
//      1번이 찍은 방식 = 1, 2, 3, 4, 5
//      2번이 찍은 방식 = 2, 1, 2, 3, 2, 4, 2, 5
//      3번이 찍은 방식 = 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
//      ==============================================================
//      문제의 길이를 고민하여, 1,2,3번이 찍은 방식중 1개씩 비교해 결과값을 int에 저장하거나, HashMap을 사용?
//      정답의 배열 길이만큼 정답_오답의 배열의 길이도 자동 조절 - 동적 배열 생성
//      정답의 배열길이와 수포자의 정답 배열 길이 일치
//
//      1차 코드 - 코드 실행시 문제없음, 코드 제출시 런타임 에러 발생, 실패 1건
//      수포자 정답 찍기 작성법 배열 정리
//        int[] people_1 = {1, 2, 3, 4, 5};
//        int[] people_2 = {2, 1, 2, 3, 2, 4, 2, 5};
//        int[] people_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//
////      수포자 동적 배열 추가
//        ArrayList<Integer> new_people_1 = new ArrayList<>();
//        ArrayList<Integer> new_people_2 = new ArrayList<>();
//        ArrayList<Integer> new_people_3 = new ArrayList<>();
//
////      맞춘 정답 저장
//        int people_1_answer = 0;
//        int people_2_answer = 0;
//        int people_3_answer = 0;
//
////      정답 배열 길이만큼 수포자 정답 길이 추가
//        for (int i = 0; i < answers.length; i++) {
//            new_people_1.add(people_1[i]);
//            new_people_2.add(people_2[i]);
//            new_people_3.add(people_3[i]);
//        }
//
//        for (int i = 0; i < answers.length; i++) {
////          1번 수포자 정답 비교
//            if (new_people_1.get(i) == answers[i]) {
//                new_people_1.set(i, 1);
//            } else {
//                new_people_1.set(i, 0);
//            }
////          2번 수포자 정답 비교
//            if (new_people_2.get(i) == answers[i]) {
//                new_people_2.set(i, 1);
//            } else {
//                new_people_2.set(i, 0);
//            }
////          3번 수포자 정답 비교
//            if (new_people_3.get(i) == answers[i]) {
//                new_people_3.set(i, 1);
//            } else {
//                new_people_3.set(i, 0);
//            }
//        }
////      값이 1일 경우 각각의 people값 증가
//        for (int i = 0; i < answers.length; i++) {
//            if (new_people_1.get(i) == 1) {
//                people_1_answer++;
//            }if (new_people_2.get(i) == 1) {
//                people_2_answer++;
//            }if (new_people_3.get(i) == 1) {
//                people_3_answer++;
//            }
//        }
//        System.out.println("people_1_answer = " + people_1_answer);
//        System.out.println("people_2_answer = " + people_2_answer);
//        System.out.println("people_3_answer = " + people_3_answer);
//
////      가장 높은점수 받은 사람이 여럿일 경우 오름차순 정렬
//        ArrayList<Integer> result = new ArrayList<>();
//
//        if (people_1_answer > people_2_answer && people_1_answer > people_3_answer) {
//            result.add(1);
//        } else if (people_2_answer > people_1_answer && people_2_answer > people_3_answer) {
//            result.add(2);
//        } else if (people_3_answer > people_1_answer && people_3_answer > people_2_answer) {
//            result.add(3);
//        } else if (people_1_answer == people_2_answer && people_2_answer == people_3_answer) {
//            result.add(1);
//            result.add(2);
//            result.add(3);
//        } else if ( people_1_answer == people_2_answer ){
//            result.add(1);
//            result.add(2);
//        } else if ( people_2_answer == people_3_answer ){
//            result.add(2);
//            result.add(3);
//        } else if ( people_1_answer == people_3_answer ) {
//            result.add(1);
//            result.add(3);
//        }
//
//        int[] answer = result.stream().mapToInt(i -> i).toArray();
//        for (int i = 0; i < answer.length; i++) {
//            System.out.println("answer[i] = " + answer[i]);
//        }


//      2차 코드 작성
//      시간 복잡도 고려 코딩 작성
//      기존 코드에서 줄일수 있는 부분을 줄일것 - 정답괴 수포자 정답을 비교해서 정답일 경우 people answer 값 증가
//      for문을 최소화 시켜볼것

        int[] people_1 = {1, 2, 3, 4, 5};
        int[] people_2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] people_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

//      수포자 동적 배열 추가
        ArrayList<Integer> new_people_1 = new ArrayList<>();
        ArrayList<Integer> new_people_2 = new ArrayList<>();
        ArrayList<Integer> new_people_3 = new ArrayList<>();

//      맞춘 정답 저장
        int people_1_answer = 0;
        int people_2_answer = 0;
        int people_3_answer = 0;

//      정답 배열 길이만큼 수포자 정답 길이 추가
        for (int i = 0; i < answers.length; i++) {
//          수포자 정답이 올바르게 들어가도록 진행 필요
            int num_1 = i % 5;
            System.out.println("num_1 = " + num_1);
            new_people_1.add(people_1[num_1]);
            int num_2 = i % 7;
            new_people_2.add(people_2[num_2]);
            int num_3 = i % 9;
            new_people_3.add(people_3[num_3]);

//          1번 수포자 정답 비교
            if (new_people_1.get(i) == answers[i]) {
                people_1_answer++;
            }
//          2번 수포자 정답 비교
            if (new_people_2.get(i) == answers[i]) {
                people_2_answer++;
            }
//          3번 수포자 정답 비교
            if (new_people_3.get(i) == answers[i]) {
                people_3_answer++;
            }
        }

        int[] people_answer = {people_1_answer,people_2_answer,people_3_answer};

//      =========================================================
//      arrays.sort() 이용 아래쪽 코드 개선 **
//      people_answer의 최대값 구하기 (정답을 가장 많이 맞춘 갯수)
//      for문으로 계산 개산 - 시간 복잡도 부분 개산 필요
//      stream, for문 시간 복잡도 확인 필요 **
//      people_answer의 최대값 구하기 (정답을 가장 많이 맞춘 갯수)
//        IntStream intStream = Arrays.stream(people_answer);
//        OptionalInt optionalInt = intStream.max();
//        int maxAsInt = optionalInt.getAsInt();

////      가장 높은점수 받은 사람이 여럿일 경우 오름차순 정렬
//        ArrayList<Integer> result = new ArrayList<>();
//        for (int i = 1; i < people_answer.length + 1; i++) {
//            if (maxAsInt == people_answer[i-1]) {
//                result.add(i);
//            }
//        }
//      ========================================================= 수정 코드
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < people_answer.length; i++) {
            result.add(people_answer[i]);
        }
        Collections.sort(result, Collections.reverseOrder());
        ArrayList<Integer> result_1 = new ArrayList<>();
        int max_num = result.get(0);
        for (int i = 0; i < result.size(); i++) {
            if (max_num == result.get(i)) {
                result_1.add(i+1);
            }
        }

        int[] answer = result_1.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < answer.length; i++) {
            System.out.println("Max answer people = " + answer[i]);
        }
    }
}
