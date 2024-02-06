package entities;

import java.util.ArrayList;
import java.util.List;

import peoples.Student;
import peoples.Teacher;

public class Discipline {
  private String name;
  private Teacher teacher;
  private List<Student> students = new ArrayList<Student>();

  public Discipline(String name, Teacher teacher, List<Student> students) {
    this.name = name;
    this.teacher = teacher;
    this.students = students;
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

  public Teacher getTeacher() {
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

  public void printDiscipline() {
    System.out.println("Discipline: " + this.getName());

    if (teacher != null) {
      this.teacher.printInformation();
    } else {
      System.out.println("This discipline has no teacher.");
    }

    if (this.students.isEmpty()) {
      System.out.println("This discipline has no students.");
    } else {
      for (Student student : this.getStudents()) {
        student.printInformation();
      }
    }
  }
}