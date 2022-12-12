//uses carnivore interface and bird inheritance to create owl specifications

package animalkingdom;

public class owl extends bird implements ICarnivore{
  public owl(String species){ //constructor
    super(species);
    //TODO Auto-generated constructor stub
  }
  
  public String toString(){ //print statement for info.
    System.out.println(m_name + " is a " + m_species + " owl.");
    System.out.println("   " + m_age);
    System.out.print("   ");
    return eatsMeat();
  }
  
  @Override
  public boolean isAlive(){ //calls parent
    return true;
  }
  
  @Override
  public void getSpecies(String species){ //calls parent
    System.out.println(species);
  }
  
  @Override
  public String eatsMeat(){ //calls interface
    return "This animal eats meat.";
  }
  
  public boolean Plants(){return false;}
  
  public boolean Meat(){return true;}
}
