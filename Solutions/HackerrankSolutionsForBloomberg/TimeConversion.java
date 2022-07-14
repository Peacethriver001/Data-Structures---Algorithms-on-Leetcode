//import java.util.HashSet;

public class TimeConversion {
    public static void main (String [] args){
        // StringBuilder start = new StringBuilder("Peace");
        // StringBuilder one = start.delete(2, 5);
        // System.out.println(one);
        String time = "07:56:23PM";
        System.out.println(timeConversion(time));  
    }

    public static String timeConversion(String s){
        int hour = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3, 5));
        int seconds = Integer.parseInt(s.substring(6, 8));
        String meridiem = s.substring(8, 10);

        hour += ((meridiem.equals("PM") && hour != 12) ? 12 : 0);
        hour -= ((meridiem.equals("AM") && hour == 12) ? 12 : 0);

        return String.format("%02d", hour) + ":" + String.format("%02d", minutes) + ":" 
        + String.format("%02d", seconds);
    }
}
