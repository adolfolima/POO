/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/
import java.util.*;
public class Inventory{
private int spaces;
private double gold;
private ArrayList<Pair<Item,Boolean>> items;
public Inventory(){
	spaces=0;
	gold=0;
	items= new ArrayList<Pair<Item,Boolean>>();
	}
//public ~Inventory(){;}
public double getTotalGold(){return gold;}
public int getAveiableSpace(){return spaces;}
public void spendGold(double gold){this.gold=this.gold-gold;}
public void earnGold(
double gold){this.gold=this.gold+gold;}
public void setSpaces(int spaces){this.spaces=spaces;}
public Item searchItem(String name){
  int i,n;
  n=items.size();
  for(i=0;i<n;i++){
    if(items.get(i).getFirst().getName()==name){return items.get(i).getFirst();}
  }
return null;
}
public Item searchItem(int n){
if(n<items.size())return items.get(n).getFirst();
return null;
}
public void insertItem(Item item){
Pair<Item,Boolean> aux;
aux=new Pair<Item,Boolean>(item,true);
items.add(aux);}
public void removeItem(String name){
  int i,n;
  n=items.size();
  for(i=0;i<n;i++){
    if(items.get(i).getFirst().getName()==name){items.remove(i);}
  }
}
public void removeItem(int n){items.remove(n);}
public int size(){
return  items.size();
}
}
