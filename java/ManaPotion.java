/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/
public class ManaPotion extends Potion{
public ManaPotion(String name, double price, int restorepts){
super(name,price,restorepts);
}
@Override
public ManaPotion clone(){
return (ManaPotion)this.clone();}
public int use (){ return this.getRestorePts();
}
}
