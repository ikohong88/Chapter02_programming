import java.util.*;

public class Prac_algorithm_28 {
    public Prac_algorithm_28(int n, int m) {
//     두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
//      ==========================================
//      2부터 시작을 해서 9순서대로 나눌때 나머지값이 0일 경우, 해당 값을 배열 리스트에 추가 - 1은 무조건 포함되므로 제외
//      2 ~ 9동안 진행을 해서 나머지의 값이 0이 없을 경우, 마지막값을 배열에 추가
//      값은 값이 있을 경우, 해당 값을 제곱하도록 계산
//      최대 공약수 - 각 값의 최대값을 추출해 곱하도록함, 한쪽만 값이 있을 경우, 해당 값을 곱하기
//      최소 공배수 - 각 값의 최소값을 추출해 곱하도록함, 한쪽만 값이 있을 경우, 해당 값은 제외
//      HashMap을 이용해 key, value값으로 구분지어 비교를 해야될지 고민
//      앞의 값 혹은 뒤의 값 둘중 어떤값이 큰지는 확인이 불가


        ArrayList<Integer> list_n = new ArrayList<>();
        ArrayList<Integer> list_m = new ArrayList<>();
        int count = 2;
//      n의 공약수
        while (true) {
            if ( n == 1 ) {
                count = 2;
                break;
            }
            else if (n % count == 0) {
                list_n.add(count);
                n = n/count;
//                System.out.println("count : "+count);
                count = 2;
//                System.out.println("n : "+ n);
            } else {
                count++;
//                System.out.println("else count : " + count);
            }
        }
//      n의 공약수 구하기
        while (true) {
            if ( m == 1 ) {
                count = 2;
                break;
            }
            else if (m % count == 0) {
                list_m.add(count);
                m = m/count;
//                System.out.println("count : "+count);
                count = 2;
//                System.out.println("m : "+ m);
            } else {
                count++;
//                System.out.println("else count : " + count);
            }
        }

        Map<Integer, Integer> map_n = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map_m = new HashMap<Integer, Integer>();
        for (int i : list_n) {
            Integer _count = map_n.get(i);
            if (_count == null) {
                map_n.put(i, 1);
            } else {
                map_n.put(i, _count + 1);
            }
        }
        for (int i : list_m) {
            Integer _count = map_m.get(i);
            if (_count == null) {
                map_m.put(i, 1);
            } else {
                map_m.put(i, _count + 1);
            }
        }
//        Integer a = map_n.size();
//        Integer b = map_m.size();
//        int size_check = a.compareTo(b);

//      for-each 사용 고려
//      size 비교 > 큰 값의 key가 포합되어있는지 확인, 포함이 되어있지 않다면,
//      반복이 많은 관계로 코드를 별도의 메소트 생성?
        int max = 1;
        int min = 1;
        if (map_n.size() < map_m.size()) {
            for (Integer key_m : map_m.keySet()) {
                if(map_n.containsKey(key_m)) {
                    if (map_n.get(key_m) == map_m.get(key_m)) {
                        max *= Math.pow((double) key_m, (double) map_m.get(key_m));
                        min *= Math.pow((double) key_m, (double) map_m.get(key_m));
                    } else if (map_n.get(key_m) < map_m.get(key_m)) {
                        max *= Math.pow((double) key_m, (double) map_m.get(key_m));
                    } else {
                        max *= Math.pow((double) key_m, (double) map_n.get(key_m));
                    }
                } else {
                    max *= Math.pow((double) key_m, (double) map_m.get(key_m));
                }
            }
        } else if (map_n.size() > map_m.size()) {
            for (Integer key_n : map_n.keySet()) {
                if(map_m.containsKey(key_n)) {
                    if (map_n.get(key_n) == map_m.get(key_n)) {
                        max *= Math.pow((double) key_n, (double) map_n.get(key_n));
                        min *= Math.pow((double) key_n, (double) map_n.get(key_n));
                    } else if (map_n.get(key_n) < map_m.get(key_n)) {
                        max *= Math.pow((double) key_n, (double) map_m.get(key_n));
                    } else {
                        max *= Math.pow((double) key_n, (double) map_n.get(key_n));
                    }
                } else {
                    max *= Math.pow((double) key_n, (double) map_n.get(key_n));
                }
            }
        } else if (map_n.size() == map_m.size()) {
            for (Integer key_n : map_n.keySet()) {
                if(map_m.containsKey(key_n)) {
                    if (map_n.get(key_n) == map_m.get(key_n)) {
                        max *= Math.pow((double) key_n, (double) map_n.get(key_n));
                        min *= Math.pow((double) key_n, (double) map_n.get(key_n));
                    } else if (map_n.get(key_n) < map_m.get(key_n)) {
                        max *= Math.pow((double) key_n, (double) map_m.get(key_n));
                    } else {
                        max *= Math.pow((double) key_n, (double) map_n.get(key_n));
                    }
                } else {
                    max *= Math.pow((double) key_n, (double) map_n.get(key_n));
                }
            }
        }
        System.out.println("max = " + max);

//        for (Integer key_n : map_n.keySet()) {
//            for (Integer key_m : map_m.keySet()) {
//                if (key_n == key_m) {
//                    if (map_n.get(key_n) == map_m.get(key_m)) {
//                        max += Math.pow((double) key_n, (double) map_n.get(key_n));
//                        min += Math.pow((double) key_n, (double) map_n.get(key_n));
//                    } else if (map_n.get(key_n) < map_m.get(key_m)) {
//                        max += Math.pow((double) key_m, (double) map_m.get(key_m));
//                    } else {
//                        max += Math.pow((double) key_n, (double) map_m.get(key_n));
//                    }
//                }
//            }
//        }

        // Map 출력
        for (Integer key : map_n.keySet()) {
            System.out.println("key n : " + key + " : " + map_n.get(key));
        }
        for (Integer key : map_m.keySet()) {
            System.out.println("key m : " + key + " : " + map_m.get(key));
        }

//      Set을 사용할 수 있지만, 접근부분이 애매해서 제외
//        Set<Integer> set_n = new HashSet<Integer>(list_n);
//        Set<Integer> set_m = new HashSet<Integer>(list_m);
//        for (int i : set_n) {
//            System.out.println("list_n - " + i + " : " + Collections.frequency(list_n, i));
//        }
//        for (int i : set_m) {
//            System.out.println("list_m - " + i + " : " + Collections.frequency(list_m, i));
//        }

        for (int i : list_n) {
            System.out.println("list_n element = " + i);
        }
        for (int i : list_m) {
            System.out.println("list_m element = " + i);
        }
        int[] answer = {};
    }
}

//  뒷 자리수가 앞자리수보다 무조건 큰값인가?
//  최대 공약수 구하는 조건
//    public int gcd(int n, int m) {
//        if (n < m) {
//            while (n > 0) {
//                int tmp = n;
//                n = m % n;
//                m = tmp;
//            }
//            return m;
//        }
//        else if (n > m) {
//            while (m > 0) {
//                int tmp = m;
//                m = n % m;
//                n = tmp;
//            }
//            return n;
//        }
////      두 값이 같을 경우, 아무값이나 리턴해도 상관없음
//        return m;
//    }
//    //  최소 공배수 구하는 조건
//    public int lcm(int n, int m) {
//        System.out.println("gcd(n, m) = " + gcd(n, m));
//        return n * m / gcd(n, m);
//    }
//    public int[] solution(int n, int m) {
//        int[] answer = new int[2];
//        if (n < m) {
//            answer[0] = gcd(n, m);
//            answer[1] = lcm(n, m);
//        } else {
//            answer[0] = lcm(n, m);
//            answer[1] = gcd(n, m);
//        }
//        return answer;
//    }

//     제출 가능한 코드
//     public int gcd(int n, int m) {
//         while (n > 0) {
//             int tmp = n;
//             n = m % n;
//             m = tmp;
//         }
//         return m;
//     }
//     public int lcm(int n, int m) {
//         return n * m / gcd(n, m);
//     }
//     public int[] solution(int n, int m) {
//         int[] answer = new int[2];

//         answer[0] = gcd(n, m);
//         answer[1] = lcm(n, m);

//         return answer;

