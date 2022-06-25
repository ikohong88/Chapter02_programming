public class Prac_algorithm_13 {
    public Prac_algorithm_13(int n) {
//        1차 시도 - 3진법으로 문자열 전환후, 문자열을 뒤집을려고 시도했으니, 굳이 할 필요가 없음
//        StringBuffer sb = new StringBuffer(Integer.toString(n,3));
//        String reverse = sb.reverse().toString();

//      풀이
        String _solution = Integer.toString(n, 3);
        int answer = 0;
        double count = 0;
        for (int i = 0; i < _solution.length(); i++) {
            answer += Integer.parseInt(_solution.substring(i, i + 1)) * (int) Math.pow(3, count);
            count++;
        }
        System.out.println("answer = " + answer);

//      추가 확인 사항 - Integer.parseInt(a,b)를 이용해서도 제곱근이 가능해 굳이 문자열로 바꿀필요없음
//      숫자에서 계산을 해서 문자열에 포함시킬수 있기에, 위의 코드가 아닌 방식도 가능, 허나 시간 복잡도 부분에서는 큰 차이가 없는것으로 보임

//      String a = "";
//      while(n > 0){
//          a = (n % 3) + a;
//          n /= 3;
//     }
//     a = new StringBuilder(a).reverse().toString();
//     return Integer.parseInt(a,3);
    }
}

