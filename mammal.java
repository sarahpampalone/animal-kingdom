//class that will be inherited by all mammal class types

package animalkingdom;
import java.lang.String;

public abstract class mammal extends animal{  //mammal.java
  public mammal(String species){  //constructor
    super(species);
    //TODO Auto-generated constructor stub
  }
  
  //m_age is visible
  private String m_hairColor;
  protected void setHairColor(String color){  //sets color
    m_hairColor = color;
  }
  public String getHairColor(){return m_hairColor;} //returns color
}
