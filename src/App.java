import java.util.ArrayList;
import java.util.List;

import entities.Discipline;
import entities.School;
import peoples.Student;
import peoples.Teacher;

public class App {
  public static void main(String[] args) throws Exception {
    List<Student> students01 = new ArrayList<Student>();
    List<Student> students02 = new ArrayList<Student>();
    List<Discipline> disciplines = new ArrayList<Discipline>();

    /**
     * Create students instances and added them to the students array.
     */
    Student student01 = new Student("Daniel Sansão Araldi", 20, "KGH87909");
    Student student02 = new Student("Rafael Mota Alves", 19, "OID98364");
    Student student03 = new Student("Jonathas Meine", 14, "NBW98235");

    students01.add(student01);
    students01.add(student02);

    students02.add(student01);
    students02.add(student03);

    /**
     * Create teachers instances.
     */
    Teacher teacher01 = new Teacher("Rodrigo Lyra", 38, 10);
    Teacher teacher02 = new Teacher("Marcos Carrard", 45, 2);

    /**
     * Create disciplines instances and added them to the disciplines array.
     */
    Discipline discipline01 = new Discipline("Paradigmas de Programação", teacher01, students01);
    Discipline discipline02 = new Discipline("Algoritmos de Programação II", teacher02, students02);

    disciplines.add(discipline01);
    disciplines.add(discipline02);

    /**
     * Create school instance.
     */
    School school = new School("Escola Politécnica do Mar, Ciência e Tecnologia", disciplines);

    /*
     * Print all information about school instance.
     */
    school.print();
  }
}