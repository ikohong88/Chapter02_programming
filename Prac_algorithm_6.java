public class Prac_algorithm_6 {
    public Prac_algorithm_6(long n) {
//      이전 사용했던 코드 - 에러사항 > 프로그래머스에서 리턴방식이 int[]방식이라 사용 불가능 및 제출시 에러발생
//      ArrayList<Integer> answer = new ArrayList<>();
//      Collections.sort(answer, Collections.reverseOrder());

//      long값 문자열로 변환 및 문자열 뒤집기
        String s = String.valueOf(n);
        StringBuffer sb = new StringBuffer(s);
        String reverse = sb.reverse().toString();

//      배열 생성
        int[] answer = new int[s.length()+1];

//      반복문을 활용한 리스트값 추가
        for (int i = 0; i < s.length(); i++) {
            answer[i] += Integer.valueOf(reverse.substring(i,i+1));
            System.out.println("answer = " + answer[i]);
        }
    }
}
