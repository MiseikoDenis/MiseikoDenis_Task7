package home;


import java.util.*;


public class SetClass {

  static Set<Integer> first = new HashSet<>();

  public static void first() {
    Card card1 = new Card();
    first.add(card1.setNumber(1234473));
    first.add(card1.setNumber(2315468));
    first.add(card1.setNumber(3167895));
    System.out.println(first);
  }

  static Set<Integer> second = new TreeSet<>();


  public static void second() {
    int sum = 0;
    int max = 140;
    int dif;

    second.add(30);
    second.add(25);
    second.add(50);
    second.add(15);
    second.add(43);

    Iterator<Integer> itr = second.iterator();

    System.out.println(second);
    for (int num : second) {
      sum = sum + num;
    }
    System.out.println(sum);
    if (max < sum) {
      dif = sum - max;
      System.out.println(dif);
      while (itr.hasNext()) {
        if (dif <= itr.next()) {
          itr.remove();
          System.out.println(second);
          break;
        }

      }


    }
    while (second.size() >= 1) {
      second.remove(second.toArray()[0]);
      System.out.println(second);
    }


  }


}
