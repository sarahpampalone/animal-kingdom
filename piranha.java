//uses carnivore interface and fish inheritance to create piranha specifications

package animalkingdom;

public class piranha extends fish implements ICarnivore{
  public piranha(String species){ //constructor
    super(species);
    //TODO Auto-generated constructor stub
  }
  
  public String getSpecies(){return m_species;} //returns species
  
  public String toString(){ //print statement for info.
    System.out.println(m_name + " is a " + m_species + " piranha.");
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
