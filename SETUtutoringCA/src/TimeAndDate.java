import java.util.HashMap;
import java.util.Map;

public class TimeAndDate {

    static Map<String, String> timeToDate = new HashMap<String, String>();

    TimeAndDate() {
        timeToDate.put("15.30", "19/06/2024");
        timeToDate.put("16.00", "20/06/2024");
        timeToDate.put("16.30", "21/06/2024");
        timeToDate.put("17.00", "22/06/2024");
    }

    public boolean validate(String time, String date){
        return date == timeToDate.get(time);
    }
}

