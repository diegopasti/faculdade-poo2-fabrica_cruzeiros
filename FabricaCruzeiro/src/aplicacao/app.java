package aplicacao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import seletor.Seletor;
import utils.Menu;
import utils.TipoCruzeiros;
import cruzeiro.Cruzeiro;
import cruzeiro.CruzeiroAbstrato;

public class app {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Cruzeiro> ListaCruzeiros = new ArrayList<Cruzeiro>();
		
		Menu Menu = new Menu();
		Boolean Ativo = true;
		Scanner scanner = new Scanner(System.in);
		
		
		int opcao = 0;
		
		while(Ativo){
			
			opcao = Menu.ExibirMenu();
			switch(opcao){
			
			case 1:
				Menu.LimparTela();
				break;
			
			case 11:
				Menu.LimparTela();
				ListaCruzeiros.add((CruzeiroAbstrato) Seletor.INSTANCE.SelecionarCruzeiro(TipoCruzeiros.GRANDE.toString()));
				System.out.println("\nPressione enter para prosseguir..");
				System.in.read(); 
				Menu.LimparTela();
				break;
				
			case 12:
				Menu.LimparTela();
				ListaCruzeiros.add((CruzeiroAbstrato) Seletor.INSTANCE.SelecionarCruzeiro(TipoCruzeiros.MEDIO.toString()));
				System.out.println("\nPressione enter para prosseguir..");
				System.in.read(); 
				Menu.LimparTela();
				break;
				
			case 13:
				Menu.LimparTela();
				ListaCruzeiros.add((CruzeiroAbstrato) Seletor.INSTANCE.SelecionarCruzeiro(TipoCruzeiros.PEQUENO.toString()));
				System.out.println("\nPressione enter para prosseguir..");
				System.in.read(); 
				Menu.LimparTela();
				break;
				
			case 2: 
				Menu.LimparTela();
				Menu.ExibirCruzeiros(ListaCruzeiros);
				System.out.println("\nPressione enter para prosseguir..");
				System.in.read(); 
				break;
			
			case 3:
				Menu.LimparTela();
				Menu.ExibirCreditos();
				Ativo=false;
				break;
				
			default:
				Menu.LimparTela();
				break;
			}
		}		
	
		scanner.close();
		System.out.println("|                                           |");
		System.out.println("|  E N C E R R A N D O   O   S I S T E M A  |");
		System.out.println("|___________________________________________|");
	}
}
