package December12LessonTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        humans.add(new Human("Ismayil", 24, LocalDate.of(2024, 1, 21)));
        humans.add(new Human("Yusif", 16, LocalDate.of(2008, 11, 23)));
        humans.add(new Human("Nadir", 18, LocalDate.of(2004, 5, 12)));

        for(Human h : humans) {
            map.put(h.getName(), h.getAge());
            if(h.getAge() > 20)
                System.out.println(h);
        }

        int height = 10;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
