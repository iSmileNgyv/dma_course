package EnumExample;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*String day = Weekdays.SUNDAY.toString();
        switch(day) {
            case "MONDAY":
                System.out.println("Monday is working day");
                break;
            case "TUESDAY":
                System.out.println("Tuesday is working day");
                break;
            case "WEDNESDAY":
                System.out.println("Wednesday is working day");
                break;
            case "THURSDAY":
                System.out.println("Thursday is working day");
                break;
            case "FRIDAY":
                System.out.println("Friday is working day");
                break;
            case "SATURDAY":
                System.out.println("Saturday is not working day");
                break;
            case "SUNDAY":
                System.out.println("Sunday is not working day");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }*/
        for(int i = 0; i < TrafficLights.values().length; i++) {
            System.out.println(TrafficLights.values()[i].getValue());
        }
    }
}
