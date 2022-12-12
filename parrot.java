//uses herbavore interface and bird inheritance to create parrot specifications

package animalkingdom;

public class parrot extends bird implements IHerbavore{
  public parrot(String species){  //constructor
    super(species);
    //TODO Auto-generated constructor stub
  }
  
  public String toString(){ //print statement for info.
    System.out.println(m_name + " is a " + m_species + " parrot");
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
