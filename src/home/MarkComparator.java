package home;

import java.util.Comparator;

public class MarkComparator implements Comparator<Pupil> {

  public int compare(Pupil a, Pupil b) {
    if (a.getMark() == b.getMark()) {
      return 0;
    }
    if (a.getMark() > b.getMark()) {
      return 1;
    } else {
      return -1;
    }
  }

}
