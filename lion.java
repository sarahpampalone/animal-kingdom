//uses carnivore interface and mammal inheretance to create lion specifications

package animalkingdom;

public class lion extends mammal implements ICarnivore{
  public lion(String species){  //constructor
    super(species);
    //TODO Auto-generated constructor stub
  }
  
  public String toString(){ //print statement for info
    System.out.println(m_name + " is a " + m_species + " lion.");
    System.out.println("   " + m_age);
    System.out.println("   ");
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
  public void eatsMeat(){   //calls interface
    return "This animal eats meat.";
  }
  
  public boolean Plants(){return false;}
  
  public boolean Meat(){return true;}
}
