package peoples.abstracts;

public abstract class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
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
    return this.age;
  }

  public void setAge(int age) {
    if (age > 6) {
      this.age = age;
    } else {
      throw new Error("Age must be greater than 6 years old!");
    }
  }

  public void printInformation() {
    System.out.println("Name: " + name + "\nAge: " + age);
  }

  public Boolean isPresentInHighSchool() {
    return this.age > 15;
  }
}
