package TrafficLight;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < TrafficLights.values().length; i++) {
            System.out.println(TrafficLights.values()[i].getValue());
        }
    }
}
