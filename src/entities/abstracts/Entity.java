package entities.abstracts;

public abstract class Entity {
  private String name;

  public Entity(String name) {
    this.name = name;
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

  public void print() {
    System.out.println("Name: " + this.getName());
  }
}
