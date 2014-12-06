/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/
public class Potion extends Item{
private int restorepts;

public Potion(String name, double price, int restorepts){
super(name,price);
this.restorepts=restorepts;
}
@Override
public Potion clone(){
return (Potion)this.clone();}
public int getDefensePts(){return 0;}
public int getAttackPts(){return 0;}
public int getRestorePts(){return restorepts;}
public int use(){return 0;}
}
