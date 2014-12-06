/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/
public class Weapon extends Item implements Refina{ 
protected int attackpts;
protected double range;
protected int level;
public Weapon(String name, double price, int attackpts,double range){
super(name,price);
this.attackpts=attackpts;
this.range=range;
level=1;
} 
@Override
public Weapon clone(){
return (Weapon)this.clone();}

public int getDefensePts(){
return 0;
}
public int getAttackPts(){
return this.attackpts*level;
}

public int getLevel(){
return level;
}

public boolean refina(double n){
double x=(Math.random()*level);
int xint;
if(level==9){return false;}
if(n<=0)return false;
x=x*x/n;
xint=(int)x;
if(xint==0){level++;return true;}
return false;
}

}
