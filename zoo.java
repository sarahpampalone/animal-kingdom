//file combining all other package files to present information entered in the system

package animalkingdom;

import java.util.ArrayList;

public class zoo{
  public static void main(String[] args){
    lion Louis = new lion("Barbary"); //create new lion
    snake Suzie = new snake("Viper"); //create new snake
    tortoise Terry = new tortoise("Leopard"); //create new tortoise
    owl Oliver = new owl("Barn"); //create new owl
    parrot Polly = new parrot("Macaw"); //create new parrot
    cow Cameron = new cow("Gernsey"); //create new cow
    piranha Penny = new piranha("Red Bellied"); //create new piranha
    whaleshark Wally = new whaleshark("large"); //create new whaleshark
    
    ArrayList<IAnimal> ark = new ArrayList<IAnimal>();  //create arraylist to store all animals
    
    ark.add(Cameron);
      Cameron.setName("Cameron");
      Cameron.setHairColor("Black and white");
      Cameron.setAge("1 year old");
    ark.add(Suzie);
      Suzie.setName("Suzie");
      Suzie.setColor("Black");
      Suzie.setAge("8 years old");
    ark.add(Terry);
      Terry.setName("Terry");
      Terry.setColor("Gray");
      Terry.setAge("60 years old");
    ark.add(Louis);
      Louis.setName("Louis");
      Louis.setHairColor("Yellow");
      Louis.setAge("3 years old");
    ark.add(Oliver);
      Oliver.setName("Oliver");
      Oliver.setColor("White");
      Oliver.setFlight(true);
      Oliver.setAge("14 years old");
    ark.add(Polly);
      Polly.setName("Polly");
      Polly.setColor("Blue");
      Polly.setFlight(true);
      Polly.setAge("1 year old");
    ark.add(Penny);
      Penny.setName("Penny");
      Penny.setWater("Fresh");
      Penny.setColor("Red");
      Penny.setAge("6 years old");
    ark.add(Wally);
      Wally.setName("Wally");
      Wally.setWater("Salt");
      Wally.setColor("Gray");
      Wally.setAge("40 years old");
    
  for(int i = 0; i < ark.size(); i++){  //loop to print items in the arraylist
    System.out.println(ark.get(i) + " ");
  }
  }
}
