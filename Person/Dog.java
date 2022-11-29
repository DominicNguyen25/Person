public class Dog {
    
  /** 
    Instance variables are defined first
    Instance variables should be defined as 'private', meaning their values
      can be accessed only from methods defined inside the class.  If the
      values need to be retrieved or set from outside the class we should
      define "getter" and "setter" methods.  More on that later
  */
  private String furColor;
  private int age;
  private int health;
  private int energy;
  private String gender;
  private int weight;

  /* Methods are defined next */
  public void sleep() {
    health = health + 10;
    energy = energy + 10;
  }

  public void eat() {
    weight = weight + 1;
    health = health + 5;
  }

  public void run () {
    energy = energy - 1;
    health = health + 5;
  }

  public void growOlder() {
    health = health - 2;
    energy = energy - 1;
  }

  public void dyeFur() {
    furColor = "pink";
  }

}
