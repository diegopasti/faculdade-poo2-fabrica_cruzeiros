package diretor;

import construtor.ConstrutorCruzeiroAbstrato;
import cruzeiro.Cruzeiro;

public class DiretorCruzeiro implements Diretor{
	
	@Override
	public Cruzeiro ConstruirCruzeiro(ConstrutorCruzeiroAbstrato Construtor){
		System.out.println("Diretor > Iniciando Fabrica��o do Cruzeiro");
		Construtor.AdicionarMotor();
		Construtor.AdicionarCabineComandante();
		Construtor.AdicionarCabinesPassageiros();
		Construtor.AdicionarBotes();	
		return Construtor.getCruzeiro();
		
	}	
}
