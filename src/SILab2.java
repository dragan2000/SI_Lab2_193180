import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Time> timesList) {//1
        List<Integer> result = new ArrayList<>();//1

        for (int i = 0; i < timesList.size(); i++) {//2
            int hr = timesList.get(i).getHours();//3
            int min = timesList.get(i).getMinutes();//3
            int sec = timesList.get(i).getSeconds();//3
            if (hr < 0 || hr > 24){//4
                if (hr < 0){//5
                    throw new RuntimeException("The hours are smaller than the minimum");//6
                }//7
                else {//8
                    throw new RuntimeException("The hours are grater than the maximum");//9
                }//10
            }//11
            else if (hr < 24) {//12
                if (min < 0 || min > 59)//13
                    throw new RuntimeException("The minutes are not valid!");//14
                else {//15
                    if (sec >= 0 && sec <= 59)//16
                        result.add(hr * 3600 + min * 60 + sec);//17
                    else//18
                        throw new RuntimeException("The seconds are not valid");//19
                }//20
            }//21
            else if (hr == 24 && min == 0 && sec == 0) {//22
                result.add(hr * 3600 + min * 60 + sec);//23
            }//24
            else {//25
                throw new RuntimeException("The time is greater than the maximum");//26
            }//27
        }//28
        return result;//29
    }//30
}
