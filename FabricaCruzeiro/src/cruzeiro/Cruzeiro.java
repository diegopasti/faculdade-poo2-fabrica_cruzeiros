package cruzeiro;

import java.util.ArrayList;

import componente.bote.Bote;
import componente.cabine.CabineComandante;
import componente.cabine.CabinePassageiro;
import componente.motor.Motor;

public interface Cruzeiro extends Cloneable{
	
	public Motor getMotor();
	public void setMotor(Motor motor);
	
	public ArrayList<Bote> getBotes(); 
	public void setBote(ArrayList<Bote> listaBotes);
	
	public CabineComandante getCabineComandante();
	public void setCabineComandante(CabineComandante cabine);
	
	public ArrayList<CabinePassageiro> getCabinesPassageiros();
	public void setCabinesPassageiros(ArrayList<CabinePassageiro> listaCabines);
	
	
	
}
