package peoples;

import peoples.abstracts.Person;

public class Student extends Person {
  private String registration;

  public Student(String name, int age, String registration) {
    super(name, age);
    this.registration = registration;
  }

  public String getRegistration() {
    return this.registration;
  }

  public void setRegistration(String registration) {
    if (registration != null && registration.trim().length() > 0) {
      this.registration = registration;
    } else {
      throw new Error("Registration cannot be empty or blank!");
    }
  }

  /**
   * Show all information about a student.
   * 
   * @return void
   */
  @Override
  public void printInformation() {
    System.out.println(
        "Student\nName: " + this.getName() + " | Age: " + this.getAge() + " | Registration: " + this.registration);
  }

  /**
   * This method returns if a student is in high school.
   * 
   * @return Boolean
   */
  @Override
  public Boolean isPresentInHighSchool() {
    return this.getAge() > 15;
  }
}