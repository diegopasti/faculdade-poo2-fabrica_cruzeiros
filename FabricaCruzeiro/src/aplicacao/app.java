package aplicacao;

import seletor.Seletor;
import utils.TipoCruzeiros;

public class app {

	public static void main(String[] args) {
		System.out.println("Sistema > Bem vindo");
		Seletor.INSTANCE.SelecionarCruzeiro(TipoCruzeiros.GRANDE.toString());
		Seletor.INSTANCE.SelecionarCruzeiro(TipoCruzeiros.MEDIO.toString());
		Seletor.INSTANCE.SelecionarCruzeiro(TipoCruzeiros.PEQUENO.toString());		
	}

}
