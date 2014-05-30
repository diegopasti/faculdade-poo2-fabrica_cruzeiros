package cruzeiro;

import java.util.ArrayList;

import componente.bote.Bote;
import componente.cabine.CabineComandante;
import componente.cabine.CabinePassageiro;
import componente.motor.Motor;

public class CruzeiroAbstrato implements Cruzeiro{

	protected CabineComandante CabineComandante;
	protected ArrayList<CabinePassageiro> CabinesPassageiros;
	protected ArrayList<Bote> Botes;
	protected Motor Motor;
	
	@Override
	public Motor getMotor() {
		return this.Motor;
	}

	@Override
	public void setMotor(Motor motor) {
		this.Motor = motor;
	}

	@Override
	public ArrayList<Bote> getBotes() {
		return this.Botes;
	}

	@Override
	public void setBote(ArrayList<Bote> listaBotes) {
		this.Botes = listaBotes;
	}

	@Override
	public CabineComandante getCabineComandante() {
		return this.CabineComandante;
	}

	@Override
	public void setCabineComandante(CabineComandante cabine) {
		this.CabineComandante = cabine;
	}

	@Override
	public ArrayList<CabinePassageiro> getCabinesPassageiros() {
		return this.CabinesPassageiros;
	}

	@Override
	public void setCabinesPassageiros(ArrayList<CabinePassageiro> listaCabines) {
		this.CabinesPassageiros = listaCabines;
		
	}

	@Override
	public Object Clone() {
		try{
			return super.clone();	
		}
		catch(Exception e){
			return null;
		}
	}

}
