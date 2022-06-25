public class Prac_algorithm_8 {
    public Prac_algorithm_8(long n) {
//      제곱근 연산자 - Math.pow , Math.sqrt (double형)
        double _sqrt = Math.sqrt(n);
        int answer;

//        while (_sqrt > 0) {
//            _sqrt += _sqrt % 10;
//            _sqrt /= 10;
//        }
        if (_sqrt % 1 == 0) {
            double result = _sqrt + 1;
            answer = (int)Math.pow(result, 2);
        } else {
            answer = -1;
        }
        System.out.println("n = " + answer);

//      추가사항 - 다른분 풀이
//
    }
}
