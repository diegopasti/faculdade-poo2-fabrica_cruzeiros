package construtor;

import java.util.ArrayList;

import componente.bote.Bote;
import componente.bote.BoteGrande;
import componente.cabine.CabineComandante;
import componente.cabine.CabinePassageiro;
import componente.motor.Motor;
import componente.motor.MotorDuplo;
import cruzeiro.Cruzeiro;
import cruzeiro.CruzeiroGrande;

public class ConstrutorCruzeiroGrande extends ConstrutorCruzeiroAbstrato {
	
	public ConstrutorCruzeiroGrande(){
		this.Cruzeiro = new CruzeiroGrande();
	}
	
	@Override
	public void AdicionarMotor(){
		if(this.ModeloMotor==null){
			this.ModeloMotor = new MotorDuplo(7000);
			this.Cruzeiro.setMotor(this.ModeloMotor);
		}
		else{
			this.Cruzeiro.setMotor((Motor) this.ModeloMotor.clone());
		}
		System.out.println("Construtor > Motor de "+this.ModeloMotor.getPotencia()+"hp foi Adicionado com Sucesso.");
	}
	
	@Override
	public void AdicionarCabineComandante() {
		if(this.ModeloCabineComandante==null){
			this.ModeloCabineComandante = new CabineComandante();
			this.Cruzeiro.setCabineComandante(this.ModeloCabineComandante);
		}
		else{
			this.Cruzeiro.setCabineComandante((CabineComandante) this.ModeloCabineComandante.clone());
		}
		System.out.println("Construtor > Cabine do Comandante foi Adicionado com Sucesso.");
	}

	@Override
	public void AdicionarCabinesPassageiros() {
		if(this.ModeloCabinePassageiro==null){
			this.ModeloCabinePassageiro = new CabinePassageiro(5);
		}
		
		ArrayList<CabinePassageiro> Cabines = new ArrayList<CabinePassageiro>();
		for(int n=0; n < 1000; n++){
			Cabines.add((CabinePassageiro) this.ModeloCabinePassageiro.clone());
		}
		
		this.Cruzeiro.setCabinesPassageiros(Cabines);
		System.out.println("Construtor > 1000 Cabines de 5 Passageiros foram Adicionadas com Sucesso.");
	}

	@Override
	public void AdicionarBotes(){
		if(this.ModeloBote==null){
			this.ModeloBote = new BoteGrande();
		}
		
		ArrayList<Bote> Botes = new ArrayList<Bote>();
		for(int n=0; n < 500; n++){
			Botes.add(this.ModeloBote.clone());
		}
		
		this.Cruzeiro.setBote(Botes);
		System.out.println("Construtor > 500 Botes Salva Vidas de 4 Passageiros foram Adicionadas com Sucesso.");
	}

	@Override
	public Cruzeiro getCruzeiro() {
		System.out.println("Construtor > Cruzeiro Grande foi construido com sucesso!");
		return this.Cruzeiro;
	}

}
