package peoples;

import peoples.abstracts.Person;

public class Teacher extends Person {
  private int yearsOfExperience;

  public Teacher(String name, int age, int yearsOfExperience) {
    super(name, age);
    this.yearsOfExperience = yearsOfExperience;
  }

  public int getYearsOfExperience() {
    if (this.yearsOfExperience < 0) {
      System.out.println("Warning: The years of experience value is less than zero!");
    }
    return this.yearsOfExperience;
  }

  public void setYearsOfExperience(int yearsOfExperience) {
    if (yearsOfExperience > 0) {
      this.yearsOfExperience = yearsOfExperience;
    } else {
      throw new Error("Year of experience must be greater than zero!");
    }
  }

  /**
   * Show all information about a teacher.
   * 
   * @return void
   */
  @Override
  public void print() {
    System.out.println("Teacher\nName: " + this.getName()
        + " | Age: " + this.getAge()
        + " | Year of Experience: " + this.yearsOfExperience
        + " | Teacher in High School: " + this.isPresentInHighSchool());
  }

  /**
   * This method returns if a teacher has classes in high school.
   * It must have five years of experience to give classes.
   * 
   * @return Boolean
   */
  @Override
  public Boolean isPresentInHighSchool() {
    return this.getAge() > 21 && this.yearsOfExperience > 5;
  }
}
