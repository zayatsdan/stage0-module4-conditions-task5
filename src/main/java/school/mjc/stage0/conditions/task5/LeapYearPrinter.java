package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int leap=year%4;
        switch(leap){
            case(0):
                if(year>=1000&&year%100==0){
                    if(year%400==0){
                        System.out.println("leap");
                    }else{
                        System.out.println("not leap");  }
                }else{
                    System.out.println("leap");}
                break;
            default:
                System.out.println("not leap");
                break;
        }
    }
}
