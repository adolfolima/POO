/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/
import java.util.*;
public class Team{
private String name;
private Color color;
private int win;
private int lose;
private int draw;
private ArrayList <Character> characters; 
public Team (String name, Color color){
characters= new ArrayList<Character>();
this.name=name;
this.color=color;
this.win=0;
this.lose=0;
this.draw=0;
}
//public ~Team();
public String getName(){return this.name;} 
public String getResults(){
return "win "+win+"      lose "+lose+",     draw "+draw;
}
public String toString(){
return "name - "+name+"       color - "+color;
}
public void resolveBattle(Team team){
 if(this.getPoints()==team.getPoints()){this.draw++;return;}
   if(this.getPoints()>team.getPoints()){this.win++;return;}else{this.lose++;return;}
}
public void addChar(Character character){
characters.add(character);
}
public void removeChar(int n){
characters.remove(n);
}
public void removeChar(String name){
  int i;
  for(i=0;i<characters.size();i++){
    if (characters.get(i).getName()==name){characters.remove(i);}
  }
}
public Character search(String name){
 int i;
  for(i=0;i<characters.size();i++){
    if(characters.get(i).getName()==name){return characters.get(i);}
  }
System.out.println("character nao encontrado");
return null;
}
public double getPoints(){
int i;
 int aux=0;
  for(i=0;i<characters.size();i++){
    aux=characters.get(i).getHP()+aux;
  }

  return aux/characters.size();
}
}
