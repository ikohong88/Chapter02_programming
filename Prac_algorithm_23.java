public class Prac_algorithm_23 {
    public Prac_algorithm_23(String s, int n) {
//      1차 코드 작성
//      공백은 아무리 밀어도 공백입니다.
//      s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
//      s의 길이는 8000이하입니다.
//      n은 1 이상, 25이하인 자연수입니다.
//      =========================================================
//      문자열을 분리 시킨다음, 아스키코드로 변환
//      z일 경우, a로 돌아가도록 코드 작성 필요
//      공백에 대한 아스키코드 확인 필요 (ascil = 32)
//      문자열 편집을 위한 StringBuffer 사용
        
//      1차 코드 작성
//      StringBuffer을 사용했으나, 문자열에 바로 추가 하는 방법을 선택할 수 있음 - answer += char
        StringBuffer sb = new StringBuffer();
        int ascii;
        int new_n;
        int new_ascii;
        int result;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
//          아스키코드로 변환
            ascii = (int)c;
//          아스키코드 + n
            int ascii_n = ascii + n;
//          공백일 경우 바로 문자열에 추가
//          아래쪽에 조건문 이외 해당 코드 처리를 하면 더 깔끔하게 코드 작성이 가능
            if (ascii == 32) {
                sb.append((char)(ascii));
            }
//          소문자일경우 - Character.isLowerCase(c)를 사용할 수 있음
            else if (ascii <= 122 && ascii >= 97) {
                if (ascii_n > 122) {
//                  z 아스키코드값보다 클 경우
//                  n % 26을 하면, 더 쉽게 접근 가능
                    new_n = (ascii_n - 123);
                    new_ascii = 97;
//                  런타임 에러 방지 - char new_c = new_ascii + new_n; 작성시 에러 발생
                    result = new_ascii + new_n;
                    char new_c = (char)result;
                    sb.append(new_c);
                } else {
                    sb.append((char)(ascii_n));
                }
            }
//          대문자일 경우 - Character.isUpperCase(c) 사용가능
            else if (ascii <= 90 && ascii >= 65) {
                if (ascii_n > 90) {
                    new_n = (ascii_n - 91);
                    new_ascii = 65;
                    result = new_ascii + new_n;
                    System.out.println("result = " + result);
                    char new_c = (char)result;
                    sb.append(new_c);
                } else {
                    sb.append((char)(ascii_n));
                }
            }
        }
        String answer = sb.toString();

        System.out.println("answer = " + answer);

//      다른사람 풀이
//      class Caesar {
//          String caesar(String s, int n) {
//              String result = "";
//              n = n % 26;
//              for (int i = 0; i < s.length(); i++) {
//                  char ch = s.charAt(i);
//                  if (Character.isLowerCase(ch)) {
//                      ch = (char) ((ch - 'a' + n) % 26 + 'a');
//                  } else if (Character.isUpperCase(ch)) {
//                      ch = (char) ((ch - 'A' + n) % 26 + 'A');
//                  }
//                  result += ch;
//              }
//              return result;
//          }
//
//          public static void main(String[] args) {
//              Caesar c = new Caesar();
//              System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
//          }
//      }
    }
}