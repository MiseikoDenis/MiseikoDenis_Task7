package home;

public class Pupil implements Comparable<Pupil>{

  private String name;
  private int mark;
  private int age;

  Pupil(String name, int mark, int age) {
    this.name = name;
    this.mark = mark;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Pupil{" +
        "name='" + name + '\'' +
        ", mark=" + mark +
        ", age=" + age +
        '}';
  }

  String getName(){
    return name;
}

  public void setName(String name) {
    this.name = name;
  }

  public int getMark() {
    return mark;
  }

  public void setMark(int mark) {
    this.mark = mark;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int compareTo(Pupil p){
    return name.compareTo(p.getName());
}

}
