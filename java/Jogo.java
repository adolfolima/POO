/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/
import java.util.Scanner;
public class Jogo extends Thread{

    private Character[] character;
    private Team[] team;
    private Armor[] armor;
    private Weapon[] weapon;
    private HealthPotion[] healthPotion;
    private ManaPotion[] manaPotion;
    private int nTimes;
    private String string;
    private boolean automatico;
    //construtor para multiplos Jogos "jogo automático"
    public Jogo(int n,String nome){
	super(nome);
	int i;
	nTimes=n;
	automatico=true;
	//criação dos characters
	character = new Character[3*n];
	for(i=0;i<n;i++){
	    character[0+i*3] = new Knight("Knight "+(i+1),10);
	    character[1+i*3] = new Wizard("Wizard "+(i+1),10);
	    character[2+i*3] = new Thief("Thief "+(i+1),10);
	}
	//teams
	team = new Team[n];
	for(i=0;i<n;i++){
	    team[i]= new Team("team "+(i+1),Color.white);
	}
	//armors
	armor = new Armor[3*n];
	for(i=0;i<n;i++){
	    armor[0+i*3] = new Armor("Armadura",1000,9,10);
	    armor[1+i*3] = new Armor("Armadura",1000,9,10);
	    armor[2+i*3] = new Armor("Armadura",1000,9,10);
	}
	//weapon
	weapon = new Weapon[3*n];
	for(i=0;i<n;i++){
	    weapon[0+i*3] = new Weapon("Espada",2000,9,10);
	    weapon[1+i*3] = new Weapon("Espada",2000,9,10);
	    weapon[2+i*3] = new Weapon("Espada",2000,9,10);
	}
	//potion
	healthPotion = new HealthPotion[3*n];
	for(i=0;i<n;i++){
	    healthPotion[0+i*3] = new HealthPotion("HealthPotion",100,20);
	    healthPotion[1+i*3] = new HealthPotion("HealthPotion",100,20);
	    healthPotion[2+i*3] = new HealthPotion("HealthPotion",100,20);
	}
	//insere itens nos characters
	for(i=0;i<n;i++){
	    character[0+i*3].insertItem(weapon[0+i]);
	    character[1+i*3].insertItem(weapon[1+i]);	
	    character[2+i*3].insertItem(weapon[2+i]);
	    character[0+i*3].insertItem(armor[0+i]);
	    character[1+i*3].insertItem(armor[1+i]);	
	    character[2+i*3].insertItem(armor[2+i]);
	    character[0+i*3].insertItem(healthPotion[0+i]);
	    character[1+i*3].insertItem(healthPotion[1+i]);	
	    character[2+i*3].insertItem(healthPotion[2+i]);
	}
	//insere characters nos times
	for(i=0;i<n;i++){
	    team[i].addChar(character[0+i*3]);
	    team[i].addChar(character[1+i*3]);
	    team[i].addChar(character[2+i*3]);
	}
	//atributos
	for(i=0;i<3*n;i++){
	    character[i].setStrenght(40);
	    character[i].setDexterity(5);
	    character[i].setConstitution(20);
	    character[i].addXP(10);
	    character[i].setSpeed(10);
	}	
    }
    //construtor para um Jogo "jogo manual"
    public Jogo(int n){
	super(" ");
	int i,j,option;
	nTimes=n;
	automatico=false;
	//criação dos characters
	character = new Character[3*n];
	for(i=0;i<n;i++){
	    System.out.println("\nJogador "+(i+1)+"\nSelecao de personagens \n 1-Knight 2-Wizard 3-Thief");
	    for(j=0;j<3;j++){
		System.out.println("Character "+(j+1));
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		if(option==1){  
		    character[j+i*3] = new Knight("Knight "+(i+1),10);
		    System.out.println("Knight criado\n"); }
		if(option==2){character[j+i*3] = new Wizard("Wizard "+(i+1),10);
		    System.out.println("Wizard criado\n"); }
		if(option!=1&&option!=2){character[j+i*3] = new Thief("Thief "+(i+1),10);
		    System.out.println("Thief criado\n");}
		
	    }   
	}
	//teams
	team = new Team[n];
	for(i=0;i<n;i++){
	    team[i]= new Team("team "+(i+1),Color.white);
	}
	//armors
	armor = new Armor[3*n];
	for(i=0;i<n;i++){
	    armor[0+i*3] = new Armor("Armadura",1000,9,10);
	    armor[1+i*3] = new Armor("Armadura",1000,9,10);
	    armor[2+i*3] = new Armor("Armadura",1000,9,10);
	}
	//weapon
	weapon = new Weapon[3*n];
	for(i=0;i<n;i++){
	    weapon[0+i*3] = new Weapon("Espada",2000,9,10);
	    weapon[1+i*3] = new Weapon("Espada",2000,9,10);
	    weapon[2+i*3] = new Weapon("Espada",2000,9,10);
	}
	//potion
	healthPotion = new HealthPotion[3*n];
	for(i=0;i<n;i++){
	    healthPotion[0+i*3] = new HealthPotion("HealthPotion",100,20);
	    healthPotion[1+i*3] = new HealthPotion("HealthPotion",100,20);
	    healthPotion[2+i*3] = new HealthPotion("HealthPotion",100,20);
	}
	//insere itens nos characters
	for(i=0;i<n;i++){
	    character[0+i*3].insertItem(weapon[0+i]);
	    character[1+i*3].insertItem(weapon[1+i]);	
	    character[2+i*3].insertItem(weapon[2+i]);
	    character[0+i*3].insertItem(armor[0+i]);
	    character[1+i*3].insertItem(armor[1+i]);	
	    character[2+i*3].insertItem(armor[2+i]);
	    character[0+i*3].insertItem(healthPotion[0+i]);
	    character[1+i*3].insertItem(healthPotion[1+i]);	
	    character[2+i*3].insertItem(healthPotion[2+i]);
	}
	//insere characters nos times
	for(i=0;i<n;i++){
	    team[i].addChar(character[0+i*3]);
	    team[i].addChar(character[1+i*3]);
	    team[i].addChar(character[2+i*3]);
	}
	//atributos
	for(i=0;i<3*n;i++){
	    character[i].setStrenght(40);
	    character[i].setDexterity(5);
	    character[i].setConstitution(20);
	    character[i].addXP(10);
	    character[i].setSpeed(10);
	}	
    }

    // metodo para refinar
    public void refina(Refina item){
	if(item.getLevel()<9){
	    //1=maxima chance de refinar, (0-1)
	    item.refina(1);
	}
    }

    //metodo para refinar todos os itens de um time (3 character)
    public void refinaTodosItens(int timeID){
	int i;
	for(i=0;i<3;i++){
	    refina(armor[i+(timeID*3)]);
	    refina(weapon[i+(timeID*3)]);
	}
    }
    //imprime o jogo em andamento (uma rodada inteira por causa do thread).
    public void imprima(){
	System.out.println(string);
	string = "";
    }

    // batalha entre 2 times, recebe os characters de 2 times e faz a batalha
    private void attack(Character[] character,Character[] character2){

	// 3 characters aleatorios do time 1
	int[] time1; 
	time1 = new int[3]; 
	time1[0]=(int)(Math.random()*3);
	do{time1[1]=(int)(Math.random()*3);
	}while(time1[1]==time1[0]);
	time1[2]=3-time1[0]-time1[1];

	// 3 characters aleatorios do time 2
	int[] time2; 
	time2 = new int[3]; 
	time2[0]=(int)(Math.random()*3);
	do{time2[1]=(int)(Math.random()*3);
	}while(time2[1]==time2[0]);
	time2[2]=3-time2[0]-time2[1];


        //time 2 ataca time 1
	character2[time2[0]].attack(character[time1[0]]);
        //armazena em string para imprimir de uma vez(por causa do uso de thread)
	string = string + character2[time2[0]].getName()+" atacou "+character[time1[0]].getName()+"\n";
	string = string + character2[time2[0]].imprima();

	character2[time2[1]].attack(character[time1[1]]);
	string = string + character2[time2[1]].getName()+" atacou "+character[time1[1]].getName()+"\n";
	string = string + character2[time2[1]].imprima();

	character2[time2[2]].attack(character[time1[2]]);
	string = string + character2[time2[2]].getName()+" atacou "+character[time1[2]].getName()+"\n";
	string = string + character2[time2[2]].imprima();


	// 3 characters aleatorios do time 1
	time1[0]=(int)(Math.random()*3);
	do{time1[1]=(int)(Math.random()*3);
	}while(time1[1]==time1[0]);
	time1[2]=3-time1[0]-time1[1];
	// 3 characters aleatorios do time 2 
	time2[0]=(int)(Math.random()*3);
	do{time2[1]=(int)(Math.random()*3);
	}while(time2[1]==time2[0]);
	time2[2]=3-time2[0]-time2[1];

	//time 1 ataca time 2
	character[time1[0]].attack(character2[time2[0]]);
	string = string + character[time1[0]].getName()+" atacou "+character2[time2[0]].getName()+"\n";
	string = string + character[time1[0]].imprima();

	character[time1[1]].attack(character2[time2[1]]);
	string = string + character[time1[1]].getName()+" atacou "+character2[time2[1]].getName()+"\n";
	string = string + character[time1[1]].imprima();

	character[time1[2]].attack(character2[time2[2]]);
	string = string + character[time1[2]].getName()+" atacou "+character2[time2[2]].getName()+"\n";
	string = string + character[time1[2]].imprima();
   
    }

    /* pot usada quando HP ou MP for menor que 50*/
    private void usePotion(Character[] character){
	int i;
	for(i=0;i<3;i++){
	    if(character[i].getHP()<50){
  
		character[i].useHealthPotion();
		string = string + character[i].getName()+" - "+character[i].imprima();}
	    if(character[i].getMP()<50){  
		character[i].useManaPotion();
		string = string + character[i].getName()+" - "+character[i].imprima();	}
	}
    }
    //sistemas que controla as rodadas
    private void rodada(int i,int j,int rodada, Character[] timeAttack,Character[] timeDefender){


	//		
	/*a cada rodada o HP volta a 100*/  
	int n;
	for(n=0;n<3;n++){
	    character[i*3+n].addHP(100);
	    character[j*3+n].addHP(100);
	} 
		  	    
	string = string + "-------------------------------------\n";

	string = string + "Jogo    "+getName()+"\n";

	string = string + "rodada    " + (rodada+1) + "\n";

	//rodada de ataques
	attack(timeAttack,timeDefender);

	//usa pot se a vida ou a mana estiver baixa (<50), resolvebattle é chamada apos usar as pot
	string = string + "-------------------------------------\n";
	usePotion(timeAttack);
	usePotion(timeDefender);
        
	//conta win lose draw
	team[j].resolveBattle(team[i]);
	team[i].resolveBattle(team[j]);  

	//armazena em string para imprimir de uma vez(por causa do uso de thread)
	string = string + "-------------------------------------\n";
	string = string + team[i].toString()+"\n";
	string= string + team[i].getResults()+"\n";
	string = string + "-------------------------------------\n";
	string = string + team[j].toString()+"\n";
	string= string + team[j].getResults()+"\n";
	
	//imprime rodada
	imprima();
         	   
		
	  
    }  
	//imprime resultados finais(usado na main)
    public void imprimeResults(){
	int i,j;
	for(i=0;i<nTimes;i++){
	    string = string + "-------------------------------------\n";	
		
	    string = string + team[i].toString()+"\n";
	    string= string + team[i].getResults()+"\n";	
	}
	imprima();
    }

    // run, roda o jogo
    public void run(){
	//i=Id do time attack,j=ID do time defender, k rodadas 
	int j,i,k,aux;
	Character[] timeAttack, timeDefender;
	timeAttack = new Character[3];
	timeDefender = new Character[3];
	for(k=0;k<10;k++){
	    for(i=0;i<nTimes;i++){
		timeAttack[0]=character[0+i*3];
		timeAttack[1]=character[1+i*3];	
		timeAttack[2]=character[2+i*3];	
		//ataques automaticos
		if(automatico==true){
		   	//atacante i ataca todos os times
			for(j=0;j<nTimes;j++){
			    timeDefender[0]=character[0+j*3];
			    timeDefender[1]=character[1+j*3];	
			    timeDefender[2]=character[2+j*3];
			    if(i!=j){
				rodada(i,j,k,timeAttack,timeDefender);
			    }
			}
		//ataques manuais		    
		}else{	
		    System.out.println("rodada "+(k+1)+"-10"+"\njogador do time "+(i+1)+"\nDigite 1 para refinar -1 para sair,qualquer outro para atacar ");
		    Scanner sc = new Scanner(System.in);
		    int option = sc.nextInt();
		    if(option==-1){return;}
		    
            		//refina itens
            		if(option==1){
			System.out.println("-------------------------------------\n antes de refinar");			
			for(aux=0;aux<3;aux++){
			    System.out.println("weapon - "+ (aux+1) +" level - "+weapon[aux+(i*3)].getLevel());}
			for(aux=0;aux<3;aux++){
			    System.out.println("armor - "+ (aux+1) +" level - "+armor[aux+(i*3)].getLevel());}

			refinaTodosItens(i);
			System.out.println("rodada "+ (k+1));
			System.out.println("-------------------------------------\n refinado");

			for(aux=0;aux<3;aux++){
			    System.out.println("weapon - "+ (aux+1) +" level - "+weapon[aux+(i*3)].getLevel());}
			for(aux=0;aux<3;aux++){
			    System.out.println("armor - "+ (aux+1) +" level - "+armor[aux+(i*3)].getLevel());}
			System.out.println("-------------------------------------");
		    }else{
			
			//1 time atacante ataca todos os times
			for(j=0;j<nTimes;j++){
			    timeDefender[0]=character[0+j*3];
			    timeDefender[1]=character[1+j*3];	
			    timeDefender[2]=character[2+j*3];
			    if(i!=j){
				rodada(i,j,k,timeAttack,timeDefender);
			    }
			} 	

		    }
		}	
		
	    }



	}

    }
}


