package home;

import java.util.ArrayList;


public class SortingClass {

  static ArrayList<Pupil> pupils = new ArrayList<>();
  public static void add() {


    pupils.add(new Pupil("Mike", 7, 13));
    pupils.add(new Pupil("Josh", 5, 14));
    pupils.add(new Pupil("Helen", 9, 12));
    for (Pupil p : pupils) {
      System.out.println(p.getName());
    }

  }
  public static void sortMark(){
    MarkComparator mcomp = new MarkComparator();
    pupils.sort(mcomp);
    System.out.println("Sorted by Mark: ");
    for (Pupil p: pupils) {
      System.out.println(p);
    }

  }
  public static void sortAge(){
    AgeComparator acomp = new AgeComparator();
    pupils.sort(acomp);
    System.out.println("Sorted by Age: ");
    for (Pupil p: pupils) {
      System.out.println(p);
    }
  }

}
