public class Prac_algorithm_9 {
    public Prac_algorithm_9(long n) {
        double _sqrt = Math.sqrt(n);
        long answer;

        if (_sqrt % 1 == 0) {
            double result = _sqrt + 1;
            answer = (long)Math.pow(result, 2);
        } else {
            answer = -1;
        }
        System.out.println("answer = " + answer);

//      추가사항 - 다른분 풀이
//      [Math.pow - 제곱근, Math.sprt - 루트] 식을 이용하면 더 간단하게 풀 수 있다.
//      if (Math.pow((int)Math.sqrt(n), 2) == n) {
//          return (long) Math.pow(Math.sqrt(n) + 1, 2);
//      }
//      return -1;
    }
}
