package home;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListClass {

  static List<String> first = new LinkedList<>();
  static List<String> second = new LinkedList<>();
  static Random rand = new Random();
  private static int i = 0;


  public static void first() {
    for (int i = 0; i <= 10; i++) {
      first.add(0, "object " + i);
      i++;
      first.add("object " + i);
      System.out.println(first);
    }
    for (int i = 10; i >= 0; i--) {
      first.remove(i + 1);
      i--;
      first.remove(0);
      System.out.println(first);
    }
  }



  public static void second() {
    second.add("first");
    second.add("second");
    second.add("third");
    second.add("fourth");
    second.add("fifth");
    second.add("sixth");
    second.add("seventh");
    second.add("eighth");
    System.out.println(second);
    while (i < 10) {
      i++;
      int randomIndex = rand.nextInt(second.size());
      String randomElement = second.get(randomIndex);
      if (randomIndex != 0 && randomIndex != second.size() - 1) {
        System.out.println(randomElement);
        second.remove(randomIndex);
        second.add(randomElement);
        System.out.println(second);
      }


    }

  }
}
