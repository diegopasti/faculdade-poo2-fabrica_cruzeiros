package construtor;

import java.util.ArrayList;

import componente.bote.Bote;
import componente.bote.BotePequeno;
import componente.cabine.CabineComandante;
import componente.cabine.CabinePassageiro;
import componente.motor.Motor;
import componente.motor.MotorDuplo;
import cruzeiro.Cruzeiro;
import cruzeiro.CruzeiroPequeno;

public class ConstrutorCruzeiroPequeno extends ConstrutorCruzeiroAbstrato {
	
	public ConstrutorCruzeiroPequeno(){
		this.Cruzeiro = new CruzeiroPequeno();
	}
	
	@Override
	public void AdicionarMotor(){
		if(this.ModeloMotor==null){
			this.ModeloMotor = new MotorDuplo(100);
			this.Cruzeiro.setMotor(this.ModeloMotor);
		}
		else{
			this.Cruzeiro.setMotor((Motor) this.ModeloMotor.Clone());
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
			this.Cruzeiro.setCabineComandante((CabineComandante) this.ModeloCabineComandante.Clone());
		}
		System.out.println("Construtor > Cabine do Comandante foi Adicionado com Sucesso.");
	}

	@Override
	public void AdicionarCabinesPassageiros() {
		if(this.ModeloCabinePassageiro==null){
			this.ModeloCabinePassageiro = new CabinePassageiro(1);
		}
		
		ArrayList<CabinePassageiro> Cabines = new ArrayList<CabinePassageiro>();
		for(int n=0; n < 10; n++){
			Cabines.add((CabinePassageiro) this.ModeloCabinePassageiro.Clone());
		}
		
		this.Cruzeiro.setCabinesPassageiros(Cabines);
		System.out.println("Construtor > 10 Cabines de 1 Passageiros foram Adicionadas com Sucesso.");
	}

	@Override
	public void AdicionarBotes(){
		if(this.ModeloBote==null){
			this.ModeloBote = new BotePequeno();
		}
		
		ArrayList<Bote> Botes = new ArrayList<Bote>();
		for(int n=0; n < 5; n++){
			Botes.add((Bote) this.ModeloBote.Clone());
		}
		
		this.Cruzeiro.setBote(Botes);
		System.out.println("Construtor > 5 Botes Salva Vidas de 1 Passageiro foram Adicionadas com Sucesso.");
	}

	@Override
	public Cruzeiro getCruzeiro() {
		System.out.println("Construtor > Cruzeiro Pequeno foi construido com sucesso!");
		return this.Cruzeiro;
	}

}