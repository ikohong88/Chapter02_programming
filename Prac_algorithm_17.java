import java.util.Collections;

public class Prac_algorithm_17 {
    public Prac_algorithm_17(int[] lottos, int[] win_nums) {
//        사용자의 값과 로또의 값을 인덱스 끼리 비교를 해서 확인 필요
//        정수형 min_lottos, max_lottos 에 0으로 시작해 카운트 증가
//        result안에 min_lottos, max_lottos 입력
        
//      1차 코드 작성 : 다른 위치에 맞는 로또가 있는걸 생각하지 않고 코드 작성
//        int min_lottos = 0;
//        int max_lottos = 0;
//        int count = 0;
//        for (int i : lottos) {
//            if (i == 0) {
//                max_lottos++;
//                count++;
//            } else if (win_nums[count] == i) {
//                max_lottos++;
//                min_lottos++;
//                count++;
//            } else {
//                count++;
//            }
//            System.out.println("count = " + count);
//        }
//        System.out.println("max_lottos = " + max_lottos);
//        System.out.println("min_lottos = " + min_lottos);

//      2차 코드 작성
        int min_lottos = 7;
        int max_lottos = 7;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == 0) {
                    max_lottos--;
                    break;
                } else if (lottos[i] == win_nums[j]) {
                    max_lottos--;
                    min_lottos--;
                    break;
                }
            }
        }
        if (max_lottos == 7) max_lottos = 6;
        if (min_lottos == 7) min_lottos = 6;
        int[] answer = {max_lottos, min_lottos};
        System.out.println("max_lottos = " + max_lottos);
        System.out.println("min_lottos = " + min_lottos);
    }
}



//      이전 파이썬 코드 작성
//        pop_win_nums = []
//        for i in win_nums:
//          pop_win_nums.append(i)
//
//        not_lottos_num_all = list(range(1,47))
//        for a in win_nums:
//          not_lottos_num_all.remove(a)
//
//        max_lottos = []
//        min_lottos = []
//
//        for i in lottos:
//        max_lottos.append(i)
//        min_lottos.append(i)
//
//        for a in win_nums:
//          if a in lottos:
//              pop_win_nums.remove(a)
//
//    # 로또 최대로 맞출 경우
//        for i in range(0,6):
//          if max_lottos[i] == 0:
//              for j in pop_win_nums:
//                  for z in max_lottos:
//                      if z not in pop_win_nums:
//                          max_lottos[i] = j
//                          pop_win_nums.remove(j)
//                          break
//                  break
//
//        print(max_lottos)
//
//    # 로또 최소로 맞출 경우
//        for i in range(0,6):
//          if min_lottos[i] == 0:
//              not_num = random.choice(not_lottos_num_all)
//              min_lottos[i] = not_num
//              not_lottos_num_all.remove(not_num)
//
//        print(min_lottos)
//
//        lottos_max_result = 7
//        lottos_min_result = 7
//
//        for i in max_lottos:
//          if i in win_nums:
//              lottos_max_result -= 1
//          if lottos_max_result == 7:
//              lottos_max_result = 6
//
//        for i in min_lottos:
//          if i in win_nums:
//              lottos_min_result -= 1
//          if lottos_min_result == 7:
//              lottos_min_result = 6
//
//        answer = [lottos_max_result, lottos_min_result]

