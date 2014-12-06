/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/
public class Knight extends Character{
protected int power;
public Knight(String name, int power){
super(name);
this.power=power;
}
protected int getAttackPts(){
return this.getAttackPoints()+power;}

protected int getDefensePts(){
return this.getDefensePoints();}

public void attack(Character character){
int n=(int)(Math.random()*10*getXP());//(0,1/XP)*x = 1 -> x=10*XP
int n2=(int)(Math.random()*100/getXP()); // (0,01*XP)*x = 1 ->  x=100/XP
int dano;
 if (n==1){
//System.out.println("evasão !!! dano 0");
string = "evasão !!! dano 0\n"; return;}
  dano=this.getAttackPts()-character.getDefensePts()+ (int)((Math.random()*10)-5);
if (dano<=0){dano=1;}
if(n2==0){
 character.addHP(-dano*2);
 //System.out.print("dano critico "); 
 //System.out.println(dano*2); 
 string = "dano critico "+  dano*2+"\n";}
else{character.addHP(-dano);
//System.out.print("dano comum ");
//System.out.println(dano);
string = "dano comum "+ dano+"\n";}

}
public void addPower(int power){
this.power=power+this.power;
}
}
