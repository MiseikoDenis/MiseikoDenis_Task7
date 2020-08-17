package home;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClass {

  static Map<String, String> first = new HashMap();
  private static String add;
  private static String name;
  private static String deleted;


  public static void first() {
    first.put("nickname 1", "name 1");
    first.put("nickname 2", "name 2");
    first.put("nickname 3", "name 3");
    first.put("nickname 4", "name 4");
    first.put("nickname 5", "name 5");
    Set<Entry<String, String>> set = first.entrySet();
    System.out.println(first);

  }


  public static void addNew(String add, String name) {
    if (first.containsKey(add) == true) {
      System.out.println("This nickname is already taken!!!");
    } else {
      first.put(add, name);
      System.out.println(first);
    }


  }

  public static void toDelete(String deleted) {
    first.remove(deleted);
    System.out.println(first);

  }
}
