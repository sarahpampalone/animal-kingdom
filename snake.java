//uses carnivore interface and reptile inheritance to create snake specifications

package animalkingdom;

public class snake extends reptile implements ICarnivore{
  public snake(String species){ //constructor
    super(species);
    //TODO Auto-generated constructor stub
  }
  
  public String toString(){ //print statements for info.
    System.out.println(m_name + " is a " + m_species + " snake.");
    System.out.println("   " + m_age);
    System.out.print("   ");
    return eatsMeat();
  }
  
  @Override
  public boolean isAlive(){ //calls parent
    //TODO Auto-generated method stub
    return true;
  }
  
  @Override
  public void getSpecies(String species){ //calls parent
    //TODO Auto-generated method stub
  }
  
  @Override
  public String eatsMeat(){ //calls interface
    return "This animal eats meat.";
  }
  
  public boolean Plants(){return false;}
  
  public boolean Meat(){return true;}
}
