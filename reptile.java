//class that will be inherited by all reptile class types

package animalkingdom;

public abstract class reptile extends animal{
  public reptile(String species){ //constructor calls parent
    super(species);
    //TODO Auto-generated constructor stub
  }
  
  private String m_color;
  public void setColor(String color){ //set color
    m_color = color;
  }
  public String getColor(){return m_color;} //return color
}
