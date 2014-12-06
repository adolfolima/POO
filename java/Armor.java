/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/
public class Armor extends Item implements Refina{
protected int defensepts;
protected int weight;
protected int level;
public Armor(String name,double price, int defensepts, int weight){
super(name,price);
this.defensepts=defensepts;
this.weight=weight;
level =1;
}
@Override
public Armor clone(){
return (Armor)this.clone();

}
public int getDefensePts(){
return this.defensepts*level;
}
public int getAttackPts(){
return 0;
}
public int getWeight(){
return this.weight;}

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
