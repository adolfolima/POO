/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/
public class HealthPotion extends Potion{
public HealthPotion(String name,double price, int restorepts){
super(name,price,restorepts);
}
@Override
public HealthPotion clone(){
return (HealthPotion) this.clone();}
public int use (){ return this.getRestorePts();
}
}
