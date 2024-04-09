package OOPS;

public class Person {

    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
   
  public static void main(String[] args) {
    Person person1 = new Person("Gayathri", 28);
    Person person2 = new Person("Riya", 25);
    System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
    System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
  }
}
