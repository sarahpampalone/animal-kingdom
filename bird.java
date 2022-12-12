package animalkingdom;

public abstract class bird extends animal{
  public bird(String species){  //constructor calls parent
    super(species);
    //TODO Auto-generated constructor stub
  }
  
  private boolean m_canFly;
  public void setFlight(Boolean fly){ //sets flight status
    m_canFly = fly;
  }
  public boolean getFlight(){ //returns flight status
    return m_canFly;
  }
  
  private String m_color;
  public void setColor(String color){ //sets color
    m_color = color;
  }
  public String getColor(){return m_color;} //returns color
    
