//uses herbavore interface and reptile inheritance to create tortoise specifications

package animalkingdom;

public class tortoise extends reptile implements IHerbavore{
  public tortoise(String species){  //constructor
    super(species);
    //TODO Auto-generated constructor stub
  }
  
  public String toString(){ //print statements for info.
    System.out.println(m_name + " is a " + m_species + " tortoise.");
    System.out.println("   " + m_age);
    System.out.print("   ");
    return eatsPlants();
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
  public String eatsPlants(){ //calls interface
    return "This animal eats plants.";
  }
  
  public boolean Plants(){return true;}
  
  public boolean Meat(){return false;}
  
}
