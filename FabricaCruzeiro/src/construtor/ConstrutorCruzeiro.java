package construtor;

import cruzeiro.Cruzeiro;

public interface ConstrutorCruzeiro {

	public void AdicionarMotor();
	public void AdicionarCabineComandante();
	public void AdicionarCabinesPassageiros();
	public void AdicionarBotes();
	public Cruzeiro getCruzeiro();
	
}
