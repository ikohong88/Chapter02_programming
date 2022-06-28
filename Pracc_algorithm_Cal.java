public class Pracc_algorithm_Cal {
    public Pracc_algorithm_Cal(int month, int day) {
//      정답과 결과를 비교해보면 달마다 28,30,31일 기준으로 작성되는듯함.
        int sparta_month = month;
        int sparata_day = day;
        int sparta = 99;
        
        if (month != 2) {
            sparta -= (31 - sparata_day);
            sparata_day = 1;
            sparta_month++;
        } else if (month == 2) {
            sparta -= (28 - sparata_day);
            sparata_day = 1;
            sparta_month++;
        }
        System.out.println("sparta = " + sparta);
        System.out.println("month = " + sparta_month);
        System.out.println("day = " + sparata_day);

        while (sparta > 0) {
            System.out.println("sparta = " + sparta);
            if (sparta_month == 13) {
                sparta_month = 1;
            }
            if (month == 2) {
                sparta_month++;
                sparta -= 28;
                if (sparta < 28) {
                    sparata_day = sparta;
                    break;
                }
            } else if (month != 2){
                sparta_month++;
                sparta -= 31;
                if (sparta < 31) {
                    sparata_day = sparta;
                    break;
                }
            }
        }
        System.out.println("sparta_month = " + sparta_month);
        System.out.println("sparata_day = " + sparata_day);
    }
}
