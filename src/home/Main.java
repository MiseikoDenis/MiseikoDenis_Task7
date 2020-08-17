package home;

public class Main {

  public static void main(String[] args) {
    
    QueueDequeClass.hospitalQueue();
    QueueDequeClass.race();

    ListClass.first();
    ListClass.second();

    SetClass.first();
    SetClass.second();

    MapClass.first();
    MapClass.addNew("nickname 6", "name 6");
    MapClass.toDelete("nickname 4");

    SortingClass.add();
    SortingClass.sortMark();
    SortingClass.sortAge();
  }
}
