package assignment6;
import java.util.*;

class Days{
    public void show(){
        String day[] = {"Monday","Tuesday","Wednesday","Friday","Saturday","Sunday"};
        for(int i=0;i<day.length;i++){
            if(day[i]=="Thursday"){
                continue;
            }
            System.out.println(day[i]);
        }
    }
}
class SkipToday{
    public void display() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        String days[] = {"Monday", "Tuesday", "Wednesday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < days.length; i++) {
            if (i == (day - 1)) {
                continue;
            }
            System.out.println(days[i]);

        }
    }
}
    class Gettodaydate{
        public void displayDates()
        {
            Date dates=new Date();
            int todaydate= dates.getDate();
            for(int i=1;i<=30;i++){
                if(todaydate+1==i)
                    break;
                System.out.print(i+" ");
            }
            System.out.println();


        }
    }
public class Question7 {
    public static void main(String[] args) {
    Days days = new Days();
    days.show();
    SkipToday skiptoday = new SkipToday();
    skiptoday.display();
    Gettodaydate gettodaydate = new Gettodaydate();
    gettodaydate.displayDates();



    }

}
