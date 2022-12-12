//creates parent class with basic animal characteristics that all created types will use

package animalkingdom;
import java.lang.String;

public abstract class animal implements IAnimal{
  private boolean m_isAlive;
  protected String m_species;
  protected String m_age;
  protected String m_name;
  
  public String getName(){return m_name;}             //set name
  protected void setName(String name){m_name = name;} //get name
  
  public String getAge(){return m_age;}           //get age
  protected void setAge(String age){m_age = age;} //set age
  
  public animal(String species){  //constructor
    m_species = species;
    m_isAlive = true;
  }
  
  public void dead(){m_isAlive = false;}  //kills animal
  
  public String getSpecies(){return m_species;} //returns species
  
  public void getStatus(){  //prints life status
    if(m_isAlive)
      System.out.println("Animal is alive");
    else
      System.out.println("Animal is dead");
  }
}
