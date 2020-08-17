package home;

import java.util.Comparator;

  public class AgeComparator implements Comparator<Pupil> {

    public int compare(Pupil a, Pupil b) {
      if (a.getAge() == b.getAge()) {
        return 0;
      }
      if (a.getAge() > b.getAge()) {
        return 1;
      } else {
        return -1;
      }
    }

  }

