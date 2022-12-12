package animalkingdom;

public class cow extends mammal implements IHerbavore{
  public cow(String species){ //constructor calls parent
    super(species);
    //TODO Auto-generated constructor stub
  }
  
  public String toString(){ //print statement for info
    System.out.println(m_name + "is a " + m_species + " cow");
    System.out.println("   " + m_age);
    System.out.print("   ");
    return eatsPlants();
  }
  
  @Override
  public boolean isAlive(){
    return  true;
  }
  
  @Override
  public void getSpecies(String species){
    System.out.println(species);
  }
  
  @Override
  public String eatsPlants(){
    return "This animal eats plants.";
  }
  
  public boolean Plants(){return true;}
  
  public boolean Meat(){return false;}
}
  
  
