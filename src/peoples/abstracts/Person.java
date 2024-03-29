package peoples.abstracts;

public abstract class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    if (this.name == null) {
      System.out.println("Warning: The name still is null!");
    }
    return this.name;
  }

  public void setNome(String name) {
    if (name != null && name.trim().length() > 0) {
      this.name = name;
    } else {
      throw new Error("Name cannot be empty or blank!");
    }
  }

  public int getAge() {
    if (this.age <= 6) {
      System.out.println("Warning: The age is less or equal than 6 years old!");
    }
    return this.age;
  }

  public void setAge(int age) {
    if (age > 6) {
      this.age = age;
    } else {
      throw new Error("Age must be greater than 6 years old!");
    }
  }

  public void print() {
    System.out.println("Name: " + name + "\nAge: " + age);
  }

  public Boolean isPresentInHighSchool() {
    return this.age > 15;
  }
}
