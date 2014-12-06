/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/
import java.util.Random;
public class Character{
private String alias;
private Inventory myitems;
private int HP;
private int MP;
private int XP;
private int speed;
private int dexterity;
private int constitution;
private int strenght;
protected String string;
public Character(String alias){
    myitems=new Inventory();
this.alias=alias;
this.HP=100;
this.XP=1;
this.strenght=1;
this.speed=1;
this.dexterity=1;
this.constitution=1;
this.MP=100;
string = "";
}
public String getName(){return alias;}
public String imprima(){return string;}
public int getDefensePoints(){
//soma de todos os pontos de defesa dos itens
int itemdefense=0,i;
for(i=0;i<myitems.size();i++){itemdefense=myitems.searchItem(i).getDefensePts()+itemdefense;}
return (constitution*5+dexterity*3+speed*2+itemdefense)*(XP/2);}
/*getAttackPts e getDefensePts são substituidas pelas outras classes*/
protected int getAttackPts(){
return 0;}
protected int getDefensePts(){
return 0;}

protected int getAttackPoints(){
 int itemattack=0,i;
  for(i=0;i<myitems.size();i++){itemattack=myitems.searchItem(i).getAttackPts()+itemattack;}
return (strenght*5+dexterity*3+speed*2+itemattack)*(XP/3);}

protected void attackCharacter(Character character){
System.out.println("sem uso em character");}

public void attack(Character character){
System.out.println("sem uso em character");
}
public boolean setAux(){
 int aux=0;
  aux=this.strenght+this.speed+this.dexterity+this.constitution;
  if (aux<100){return true;
}else {return false;}
}
public void addXP(int XP){
if (this.XP+XP<100){this.XP=XP;
}else {System.out.println("excesso de XP");}
}
public void setStrenght(int strenght){
 this.strenght=strenght;
  if(this.setAux()==false){
   this.speed=1;System.out.println("excesso de atributos\n");}
}

public void setSpeed(int speed){
 int weight=0,i;
//soma todos os weight dos items
  for(i=0;i<myitems.size();i++){weight=myitems.searchItem(i).getWeight()+weight;}
  
  this.speed=speed;
  if(this.setAux()==false){this.speed=1;System.out.println("excesso de atributos");}
  else{ this.speed=(int)(this.speed/(Math.exp((weight/20)*(weight/20))));}
/*a equação de speed foi modificada para melhor funcionamento*/}
public void setDexterity(int dexterity){
 this.dexterity=dexterity;
  if(this.setAux()==false){ this.dexterity=1;System.out.println("excesso de atributos");}
}
public void setConstitution(int constitution){
 this.constitution=constitution;
  if(this.setAux()==false){ this.constitution=1;System.out.println("excesso de atributos");}
}
public void addHP(int HP){
  if(this.HP+HP<100){
    if(this.HP+HP>0){
      this.HP=this.HP+HP;}
    else this.HP=0;}
  else this.HP=100;
}
public void addMP(int MP){
  if(this.MP+MP<100){
    if(this.MP+MP>0){
      this.MP=this.MP+MP;}
    else this.MP=0;}
  else this.MP=100;
}
public int getHP(){
  return this.HP;
}
public int getMP(){
  return this.MP;
}
//como nao tem friend em java, para acessar o XP é necessario o getXP
public int getXP(){
  return this.XP;
}
//use
public void useManaPotion(){

  Item p; 

  p=searchItem("ManaPotion");
  
  if(p==null){
string = "sem ManaPotion\n"; 
  //System.out.println("sem ManaPotion");
        }else{
      addMP(p.use());
string = "ManaPotion foi usado\n";
//System.out.println("ManaPotion foi usado");
      removeItem("ManaPotion");
       }
}
public void useHealthPotion(){
  Item p;
   p=searchItem("HealthPotion");
   if(p==null){
string = "sem HealthPotion\n";
  // System.out.println("sem HealthPotion");
    }else{
   addHP(p.use());
string = "HealthPotion foi usado\n";
//System.out.println("HealthPotion foi usado");
   removeItem("HealthPotion");
    }
  
}
// metodo mara usar o inventory no character
 public double getTotalGold(){return myitems.getTotalGold();}
  public int getAveiableSpace(){return myitems.getAveiableSpace(); }
  public void spendGold(double gold){myitems.spendGold(gold);}
  public void earnGold(double gold){myitems.earnGold(gold);}
  public void setSpaces(int spaces){myitems.setSpaces(spaces);}
  public Item searchItem(String name){return myitems.searchItem(name); }
  public Item searchItem(int n){return myitems.searchItem(n);}
  public void insertItem(Item item){myitems.insertItem(item);}
  public void removeItem(String name){myitems.removeItem(name);}
  public void removeItem(int n){myitems.removeItem(n);}
}
