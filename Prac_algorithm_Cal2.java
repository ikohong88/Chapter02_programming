import java.util.Calendar;

public class Prac_algorithm_Cal2 {
    Prac_algorithm_Cal2(int month, int day) {
        Calendar today = Calendar.getInstance();
//      들어온 값으로 캘린더 셋팅
        today.set(Calendar.MONTH, month);
        today.set(Calendar.DATE, day);
        int _year = today.get(Calendar.YEAR);
        int _month = today.get(Calendar.MONTH);
        int _date = today.get(Calendar.DATE);
//      수정된 날짜
        System.out.println("Set Calendar : " + _year +" / "+ _month +" / "+ _date);
//      스파르타 강의하는 일수만큼 더한다.
        today.add(Calendar.DATE, 98);
        _year = today.get(Calendar.YEAR);
        _month = today.get(Calendar.MONTH);
        _date = today.get(Calendar.DATE);
        System.out.println("Add Calendar : " + _year +" / "+ _month +" / "+ _date);
    }
}
