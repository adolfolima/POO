/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/
public class Item{
  private String name;
  private double price;

public Item (String name, double price){
  this.name=name;
  this.price=price;
}
@Override
public Item clone(){
return (Item)this.clone();
}
int use(){return 0;}
public String getName(){return name;}
public int getAttackPts(){return 0;}
public int getDefensePts(){return 0;}
public int getWeight(){return 0;}
public double getPrice(){return price;}
}
