package entities;

import java.util.ArrayList;
import java.util.List;

import entities.abstracts.Entity;
import peoples.Student;
import peoples.Teacher;

public class Discipline extends Entity {
  private Teacher teacher;
  private List<Student> students = new ArrayList<Student>();

  public Discipline(String name, Teacher teacher, List<Student> students) {
    super(name);
    this.teacher = teacher;
    this.students = students;
  }

  public Teacher getTeacher() {
    if (this.teacher == null) {
      System.out.println("Warning: The teacher still is null!");
    }
    return this.teacher;
  }

  public void setTeacher(Teacher teacher) {
    if (teacher != null) {
      this.teacher = teacher;
    } else {
      throw new Error("Teacher doesn't be null!");
    }
  }

  public List<Student> getStudents() {
    if (this.students == null) {
      System.out.println("Warning: The students still is null!");
    }
    return this.students;
  }

  public void setStudent(Student student) {
    if (student != null) {
      for (Student studentInDiscipline : this.getStudents()) {
        if (studentInDiscipline != null && studentInDiscipline.getName() == student.getName()) {
          throw new Error("This student already this discipline!");
        }
      }

      Boolean isAdded = this.students.add(student);
      if (!isAdded) {
        throw new Error("Student doesn't was added!");
      }
    } else {
      throw new Error("Student doesn't be null!");
    }
  }

  /**
   * Use print method of Entity abstract class to print Discipline class
   * information.
   * 
   * @return void
   */
  @Override
  public void print() {
    System.out.println("Discipline: " + this.getName());

    if (teacher != null) {
      this.teacher.print();
    } else {
      System.out.println("This discipline has no teacher.");
    }

    if (this.students.isEmpty()) {
      System.out.println("This discipline has no students.");
    } else {
      for (Student student : this.getStudents()) {
        student.print();
      }
    }
  }
}
