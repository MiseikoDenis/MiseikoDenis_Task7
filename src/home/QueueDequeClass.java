package home;

import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDequeClass {

  static Queue<String> hospital = new LinkedList<>();
  static Deque<String> race = new LinkedList<>();

  public static void hospitalQueue() {
    hospital.offer("Person 1");
    hospital.offer("Person 2");
    int i = 3;
    int count = 1;

    while (count < 10) {
      System.out.println(hospital);

      if (count % 3 == 0) {
        System.out.println("Этот человек прошел без очереди: Person " + i);
        hospital.remove(i);
        i++;
        count++;
      } else {
        hospital.offer("Person " + i);
        hospital.remove();
        i++;
        count++;
      }
    }
  }

  public static void race() {
    int i = 0;
    race.offer("racer 1");
    race.offer("racer 2");
    race.offer("racer 3");
    race.offer("racer 4");
    race.offer("racer 5");
    race.offer("racer 6");
    race.offer("racer 7");
    race.offer("racer 8");
    System.out.println(race);
    Iterator<String> iterator = race.iterator();
    while (iterator.hasNext() && i < 7) {
      i++;
      Collections.shuffle((List<?>) race);
      race.removeLast();
      System.out.println("После " + i + " круга : " + race);
    }
  }

}
