package seletor;

import java.util.ArrayList;

import componente.bote.Bote;
import componente.cabine.CabineComandante;
import componente.cabine.CabinePassageiro;
import componente.motor.MotorDuplo;
import componente.motor.MotorSimples;

import construtor.ConstrutorCruzeiroGrande;
import construtor.ConstrutorCruzeiroMedio;
import construtor.ConstrutorCruzeiroPequeno;
import cruzeiro.Cruzeiro;
import cruzeiro.CruzeiroGrande;
import cruzeiro.CruzeiroMedio;
import cruzeiro.CruzeiroPequeno;
import diretor.Diretor;
import diretor.DiretorCruzeiro;

public enum Seletor {

	INSTANCE;
	
	private CruzeiroPequeno CruzeiroPequeno=null;
	private CruzeiroMedio CruzeiroMedio=null;
	private CruzeiroGrande CruzeiroGrande=null;
	
	
	@SuppressWarnings("unchecked")
	public Cruzeiro SelecionarCruzeiro(String tipo){
		if(tipo=="PEQUENO"){
			CruzeiroPequeno cp;
			
			if(CruzeiroPequeno == null){
				Diretor Diretor = new DiretorCruzeiro();
				CruzeiroPequeno = (CruzeiroPequeno) Diretor.ConstruirCruzeiro(new ConstrutorCruzeiroPequeno());
			}
			else{
				System.out.println("Construtor > Clonando Cruzeiro Pequeno.");
			}
			
			cp = (CruzeiroPequeno) CruzeiroPequeno.clone();

			// clone das Subestruturas da classe Cruzeiro
			cp.setCabineComandante((CabineComandante) CruzeiroPequeno.getCabineComandante().clone());
			cp.setMotor((MotorDuplo) CruzeiroPequeno.getMotor().clone());
			cp.setBote((ArrayList<Bote>) CruzeiroPequeno.getBotes().clone());
			cp.setCabinesPassageiros((ArrayList<CabinePassageiro>) CruzeiroPequeno.getCabinesPassageiros().clone());
			return cp ;
		}
		
		else if(tipo=="MEDIO"){
			CruzeiroMedio cm;
			
			if(CruzeiroMedio == null){
				Diretor Diretor = new DiretorCruzeiro();
				CruzeiroMedio = (CruzeiroMedio) Diretor.ConstruirCruzeiro(new ConstrutorCruzeiroMedio());
			}
			else{
				System.out.println("Construtor > Clonando Cruzeiro Medio.");
			}
			
			// clone das Subestruturas da classe Cruzeiro
			cm = (CruzeiroMedio) CruzeiroMedio.clone();
			cm.setCabineComandante((CabineComandante) CruzeiroMedio.getCabineComandante().clone());
			cm.setMotor((MotorSimples) CruzeiroMedio.getMotor().clone());
			cm.setBote((ArrayList<Bote>) CruzeiroMedio.getBotes().clone());
			cm.setCabinesPassageiros((ArrayList<CabinePassageiro>) CruzeiroMedio.getCabinesPassageiros().clone());
			
			return cm;
		}
		
		else if(tipo=="GRANDE"){
			CruzeiroGrande cg;
			
			if(CruzeiroGrande == null){
				Diretor Diretor = new DiretorCruzeiro();
				CruzeiroGrande = (CruzeiroGrande) Diretor.ConstruirCruzeiro(new ConstrutorCruzeiroGrande());
			}
			
			else{
				System.out.println("Construtor > Clonando Cruzeiro Grande.");
			}
			
			// clone das Subestruturas da classe Cruzeiro
			cg = (CruzeiroGrande) CruzeiroGrande.clone();
			cg.setCabineComandante((CabineComandante) CruzeiroGrande.getCabineComandante().clone());						
			cg.setMotor((MotorDuplo) CruzeiroGrande.getMotor().clone());
			cg.setBote((ArrayList<Bote>) CruzeiroGrande.getBotes().clone());
			cg.setCabinesPassageiros((ArrayList<CabinePassageiro>) CruzeiroGrande.getCabinesPassageiros().clone());
						
			return cg;			
		}
		return null;
	}
}
