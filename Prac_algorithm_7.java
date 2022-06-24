public class Prac_algorithm_7 {
    public Prac_algorithm_7(long n) {
        String s = String.valueOf(n);
        String result = "";
        StringBuffer sb = new StringBuffer(result);

        //      배열 생성
        int[] answer = new int[s.length()];

//      반복문을 활용한 리스트값 추가
        for (int i = 0; i < s.length(); i++) {
            answer[i] += Integer.valueOf(s.substring(i,i+1));
        }

        for (int j = 0; j < s.length(); j++) {
            for (int z = j+1; z < s.length(); z++) {
                if(answer[j] < answer[z]) {
                    int temp = answer[j];
                    answer[j] = answer[z];
                    answer[z] = temp;
                }
            }
        }

//        for (int j = 0; j < s.length(); j++) {
//            if(answer[j] < answer[j + 1]) {
//                System.out.println("answer = " + answer[j] + " answer+1 = "+answer[j+1]);
//                int temp = answer[j];
//                answer[j] = answer[j + 1];
//                answer[j + 1] = temp;
//            }
//        }
        for (int a = 0; a < answer.length; a++) {
            System.out.println("answer = " + answer[a]);
            sb.insert(a, answer[a]);
        }
        Long test = Long.parseLong(sb.toString());
        System.out.println("test = " + test);
    }
}
