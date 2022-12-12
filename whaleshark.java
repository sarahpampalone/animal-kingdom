//uses herbavore interface and fish inheritance to create whale shark specifications

package animalkingdom;

public class whaleshark extends fish implements IHerbavore{
  public whaleshark(String species){  //constructor
    super(species);
    //TODO Auto-generated constructor stub
  }
  
  public String getSpecies(){return m_species;} //returns species type (from constructor)
  
  public String toString(){ //print statements for info.
    System.out.println(m_name + " is a " + m_species + " whale shark.");
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
