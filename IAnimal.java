//creates interface to be used for all animal types

package animalkingdom;

public interface IAnimal{
  String getSpecies = null;
  String toString = null;
  public boolean isAlive();
  public void getSpecies(String species);
  public boolean Meat();
  public boolean Plants();
}
