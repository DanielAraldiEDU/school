package entities;

import java.util.ArrayList;
import java.util.List;

public class School {
  private String name;
  private List<Discipline> disciplines = new ArrayList<Discipline>();

  public School(String name, List<Discipline> disciplines) {
    this.name = name;
    this.disciplines = disciplines;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name != null && name.trim().length() > 0) {
      this.name = name;
    } else {
      throw new Error("Name cannot be empty or blank!");
    }
  }

  public List<Discipline> getDisciplines() {
    return this.disciplines;
  }

  public void setDisciplines(Discipline discipline) {
    if (discipline != null) {
      for (Discipline subject : this.getDisciplines()) {
        if (subject != null && subject.getName() == discipline.getName()) {
          throw new Error("This discipline already exists!");
        }
      }

      Boolean isAdded = this.disciplines.add(discipline);
      if (!isAdded) {
        throw new Error("Discipline doesn't was added!");
      }
    } else {
      throw new Error("Discipline doesn't be null!");
    }
  }

  public void printSchool() {
    System.out.println("\nSchool: " + this.getName());
    if (this.getDisciplines().isEmpty()) {
      System.out.println("This school has no disciplines.");
    } else {
      for (Discipline discipline : this.getDisciplines()) {
        System.out.println("\n");
        discipline.printDiscipline();
      }
    }
  }
}
