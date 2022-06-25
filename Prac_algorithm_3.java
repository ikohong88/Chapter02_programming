import java.util.HashMap;
import java.util.Map;

public class Prac_algorithm_3 {
    public Prac_algorithm_3(String[] participant, String[] completion) {
        String answer = "";
//      HashMap - key,value 쌍으로 데이터 보관
        Map<String, Integer> completionMap = new HashMap<>();
        
        for(int i = 0; i < completion.length; i++) {
//      containsKey() - HashMap에 인자로 전달된 key가 존재하면 true, 아니면 false
            if (completionMap.containsKey(completion[i])) {
//          .replace - 전될된 key의 value를 전달받은 value로 교체 > completion안에 동명이인 있는지 확인하기 위한 수단
                completionMap.replace(completion[i], completionMap.get(completion[i]) + 1);
            } else {
//              인자로 key와 value를 받아 저장
                completionMap.put(completion[i], 0);
            }
        }
        for (int i = 0; i < participant.length; i++) {
            if(completionMap.containsKey(participant[i])) {
                int value = completionMap.get(participant[i]);
                if (value == -1) {
                    answer = participant[i];
                    break;
                } else {
//                  전달된 key의 value값을 교체한 다음, value값을 -1로 수정
                    completionMap.replace(participant[i], value-1);
                }
            } else {
                answer = participant[i];
                break;
            }
        }
//        return -1;
    }
}
