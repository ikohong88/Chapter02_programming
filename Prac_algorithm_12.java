public class Prac_algorithm_12 {
    public Prac_algorithm_12(int x) {
        boolean answer;
        int result = 0;
        int sum = x;
        while (sum > 0) {
            result += sum%10;
            sum /= 10;

//            알고리즘 잘못 작성
//            _check = x%10;
//            if (_check == 0) {
//                result += sum/10;
//                sum /= 10;
//            } else {
//                result += sum;
//                sum /= 10;
//            }
        }
        if (x % result == 0) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println("result = " + result);

//      다른분 풀이 - 숫자값을 문자로 변환한 다음 문자열을 잘라서 값을 더해주는 방식

//      String[] temp = String.valueOf(num).split("");
//
//      int sum = 0;
//      for (String s : temp) {
//          sum += Integer.parseInt(s);
//      }
//
//      if (num % sum == 0) {
//          return true;
//      } else {
//          return false;
//      }

    }
}
