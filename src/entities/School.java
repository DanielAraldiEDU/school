package entities;

import java.util.ArrayList;
import java.util.List;

import entities.abstracts.Entity;

public class School extends Entity {
  private List<Discipline> disciplines = new ArrayList<Discipline>();

  public School(String name, List<Discipline> disciplines) {
    super(name);
    this.disciplines = disciplines;
  }

  public List<Discipline> getDisciplines() {
    if (this.disciplines == null) {
      System.out.println("Warning: The disciplines still is null!");
    }
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

  /**
   * Use print method of Entity abstract class to print School class
   * information.
   * 
   * @return void
   */
  @Override
  public void print() {
    System.out.println("\nSchool: " + this.getName());
    if (this.getDisciplines().isEmpty()) {
      System.out.println("This school has no disciplines.");
    } else {
      for (Discipline discipline : this.getDisciplines()) {
        System.out.println("\n");
        discipline.print();
      }
    }
  }
}
