package construtor;
import componente.bote.Bote;
import componente.cabine.CabineComandante;
import componente.cabine.CabinePassageiro;
import componente.motor.Motor;

import cruzeiro.Cruzeiro;

public class ConstrutorCruzeiroAbstrato implements ConstrutorCruzeiro {
	
	protected Cruzeiro Cruzeiro = null;
	protected Bote ModeloBote = null;
	protected Motor ModeloMotor = null;
	protected CabineComandante ModeloCabineComandante = null;
	protected CabinePassageiro ModeloCabinePassageiro = null;
	
	@Override
	public void AdicionarMotor(){}
	
	@Override
	public void AdicionarCabineComandante() {}

	@Override
	public void AdicionarCabinesPassageiros() {}

	@Override
	public void AdicionarBotes(){}

	@Override
	public Cruzeiro getCruzeiro() {
		return null;
	}
}
