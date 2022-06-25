import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Prac_algorithm_1 {
    public Prac_algorithm_1() {
//        1번 문제
//        dict과 비슷한거 사용
//        a = 월 b = 일
//        20160101 (금) 기준으로 '일'단위로 플러스를 진행하여서 7로 나눈 나머지 값을 day 배열 혹은 리스트에서 뽑아내기 - 366일 있음
//        월, 일을 받아 '2016'에 합친 다음, yyyyMMdd형식으로 합쳐서 cal을 활용하여 사용

        ArrayList<String> firstarray = new ArrayList<>();

        String date = "20160101";
        SimpleDateFormatat dtFormat = new SimpleDateFormat("yyyyMMdd");
        Calendardar cal = Calendar.getInstance();
        Datee dt = dtFormat.parse(date);
        cal.setTime(dt);
        System.out.println(cal);

        String [] _string = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        for (String s: _string) {
            System.out.println(s);
    }
}
