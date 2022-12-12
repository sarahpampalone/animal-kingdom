//class that will be inherited by all fish class types

package animalkingdom;

public abstract class fish extends animal{
  public fish(String species){
    super(species);   //constructor
    //TODO Auto-generated constructor stub
  }
  
  private String m_waterType;
  protected void setWater(String waterType){  //sets water type
    m_waterType = waterType;
  }
  public String getWater(){return m_waterType;} //returns water type
  
  private String m_color;
  public void setColor(String color){ //sets color
    m_color = color;
  }
  
  public String getColor(){return m_color;} //returns color
}
