/*		

		Renan Yochiro Kawamura        -   nusp 7400767
		Adolfo Victor Freire de Lima  -   nusp 8504156

*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args )throws InterruptedException {
	int n,i,j=1;

	int[] nTimes;
	Jogo[] game;
	System.out.println("Digite 1 para manual (somente 1 jogo), qualquer outro para automatico (varios jogos)");
	Scanner sc = new Scanner(System.in);
	int option = sc.nextInt();
	System.out.println("Digite a quantidade de times(players)\npara melhor desempenho digite >2");
	sc = new Scanner(System.in);
	n = sc.nextInt();
	//jogo manual, roda somente 1 jogo
	if(option==1){
	    game= new Jogo[1];
	    game[0]= new Jogo(n);
	    game[0].start();
	
	//jogo automatico, roda varios jogo
	}else{
	    System.out.println("Digite a quantidade de Jogos");
	    sc = new Scanner(System.in);
	    j = sc.nextInt();
	    game= new Jogo[j];
	    for(i=0;i<j;i++){
		game[i]= new Jogo(n,Integer.toString(i+1));
		game[i].start();
	    }
	}
	
	//espera os jogos acabarem
	for(i=0;i<j;i++){
	    game[i].join();
	}

	//imprime resultados
	System.out.println("\n\n\nResultados gerais\n\n");
	for(i=0;i<j;i++){
	    System.out.println("-------------------------------------");
	    System.out.println("-------------------------------------");
	    System.out.println("jogo "+(i+1));
	    game[i].imprimeResults();
	}

    }
}
