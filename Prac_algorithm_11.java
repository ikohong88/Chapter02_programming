public class Prac_algorithm_11 {
    public Prac_algorithm_11(int num) {
        int count = 0;
//      int형으로 진행할 경우, 오버플로우가 발생하여, 중간에 계산이 이상해짐
        double answer = num;

        while (answer != 1) {
            if (answer % 2 == 0) {
                count++;
                answer /= 2;
                System.out.println("Solu : answer = " + answer + " count = "+ count);
            } else {
                count++;
                answer = (answer * 3)+1;
                System.out.println("Solu : answer = " + answer + " count = "+ count);
            }
        }
        if (count > 500) {
            count = -1;
        }
        System.out.println("RESULT : answer = " + answer + " count = "+ count);

//      다른분 풀이 - 정규식을 공부해서 코드를 최대한 줄이는 방향을 공부해야됨
// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
//      class Collatz {
//          public int collatz(int num) {
//              long n = (long)num;
//              for(int i =0; i<500; i++){
//                  if(n==1) return i;
//                  n = (n%2==0) ? n/2 : n*3+1;
//              }
//              return -1;
//          }
//          // 아래는 테스트로 출력해 보기 위한 코드입니다.
//          public static void main(String[] args) {
//              Collatz c = new Collatz();
//              int ex = 6;
//              System.out.println(c.collatz(ex));
//          }
//      }
    }
}
