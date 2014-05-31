package utils;

import java.util.ArrayList;
import java.util.Scanner;

import cruzeiro.Cruzeiro;

public class Menu {
	
	public int opcao=0;
	
	public int ExibirMenu(){
		LimparTela();
		ExibirTitulo();
		ExibirOpcoes(opcao);
		opcao = ExibirSolicitacao();
		return opcao;
	}
	
	public void ExibirCruzeiros(ArrayList<Cruzeiro> Lista){
		int MaxPassageiros=0;
		int MaxBotes=0;
		int MaxCruzeiros=0;
		
		System.out.println(" _____________________________________________");
		System.out.println("|                                             |");
		System.out.println("|     L I S T A   D E   C R U Z E I R O S     |");
		System.out.println("|_____________________________________________|");
		System.out.println("|          |          |      MAX      |  MAX  |");
		System.out.println("| CRUZEIRO | POTENCIA |  PASSAGEIROS  | BOTES |");
		System.out.println("|__________|__________|_______________|_______|");
		
		for(int k=0;k<Lista.size();k++){
			System.out.printf("| %-8s | %5s hp | %5d pessoas | %5s |\n",Lista.get(k).getClass().toString().replace("class cruzeiro.Cruzeiro", ""), Lista.get(k).getMotor().getPotencia(),Lista.get(k).getCabinesPassageiros().size()*Lista.get(k).getCabinesPassageiros().get(0).getCapacidade(),Lista.get(k).getBotes().size());
			MaxCruzeiros += 1;
			MaxPassageiros += Lista.get(k).getCabinesPassageiros().get(0).getCapacidade() * Lista.get(k).getCabinesPassageiros().size();
			MaxBotes += Lista.get(k).getBotes().size();
		}
		System.out.println("|__________|__________|_______________|_______|");
		System.out.println("|                                             |");
		System.out.println("|               -- T O T A L --               |");
		System.out.println("|                                             |");
		System.out.printf("| %7s Cruzeiros                           |\n",MaxCruzeiros);
		System.out.printf("| %7s Passageiros (Capacidade Max)        |\n",MaxPassageiros);
		System.out.printf("| %7s Botes Salva Vidas (Capacidade Max)  |\n",MaxBotes);
		System.out.printf("|_____________________________________________|\n");
		
		
		
		
		
		
	}
	
	private void ExibirTitulo(){
		System.out.println(" ___________________________________________");
		System.out.println("|                                           |");
		System.out.println("|  F A B R I C A   d e   C R U Z E I R O S  |");
		System.out.println("|___________________________________________|");
	}
	
	private void ExibirOpcoes(int opcao){
		System.out.println("|                                           |");
		System.out.println("| 1- CONSTRUIR CRUZEIRO                     |");
		System.out.println("|                                           |");
		
		if(opcao==1){
			System.out.println("|    1- CRUZEIRO GRANDE                     |");
			System.out.println("|    2- CRUZEIRO MÉDIO                      |");
			System.out.println("|    3- CRUZEIRO PEQUENO                    |");
			System.out.println("|                                           |");	
		}
		
		System.out.println("| 2- LISTAR CRUZEIRO PRONTOS                |");
		System.out.println("|                                           |");
		System.out.println("| 3- SAIR DO SISTEMA                        |");
		System.out.println("|___________________________________________|");
		System.out.println("");
		System.out.print(" DIGITE A OPÇÃO DESEJADA: ");
	}
	
	private int ExibirSolicitacao(){
		Scanner scanner = new Scanner(System.in);
		
		int opt = scanner.nextInt();
		
		if(opcao==1){
			switch(opt){
			case 1: return 11;
			case 2: return 12;
			case 3: return 13;
			default: return 0;
			}
		}
			
		else{
			switch(opt){
			case 1: return 1;
			case 2: return 2;
			case 3: return 3;
			default: return 0;
			}
		}
	}
	
	public void ExibirCreditos(){
		System.out.println(" ___________________________________________");
		System.out.println("|                                           |");
		System.out.println("| PROJETO DESENVOLVIDO POR DIEGO PASTI, ES- |");
		System.out.println("| TUDANTE DE SISTEMAS DE INFORMAÇÃO PELO IN-|");
		System.out.println("| TITUTO FEDERAL DO ESPIRITO SANTO.         |");
		System.out.println("|___________________________________________|");
	}
	
	public void LimparTela(){
		PularLinhas(40);
	}
	
	private void PularLinhas(int n){
		for(int c=0;c<n;c++){
			System.out.println("");
		}
	}

}
