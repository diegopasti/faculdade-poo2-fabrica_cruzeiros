package seletor;

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
	
	
	public Cruzeiro SelecionarCruzeiro(String tipo){
		if(tipo=="PEQUENO"){
			if(CruzeiroPequeno == null){
				Diretor Diretor = new DiretorCruzeiro();
				CruzeiroPequeno = (cruzeiro.CruzeiroPequeno) Diretor.ConstruirCruzeiro(new ConstrutorCruzeiroPequeno());
			}
			return (Cruzeiro) CruzeiroPequeno.Clone();
		}
		
		else if(tipo=="MEDIO"){
			if(CruzeiroMedio == null){
				Diretor Diretor = new DiretorCruzeiro();
				CruzeiroMedio = (cruzeiro.CruzeiroMedio) Diretor.ConstruirCruzeiro(new ConstrutorCruzeiroMedio());
			}
			return (Cruzeiro) CruzeiroMedio.Clone();
		}
		
		else if(tipo=="GRANDE"){
			if(CruzeiroGrande == null){
				Diretor Diretor = new DiretorCruzeiro();
				CruzeiroGrande = (cruzeiro.CruzeiroGrande) Diretor.ConstruirCruzeiro(new ConstrutorCruzeiroGrande());
			}
			return (Cruzeiro) CruzeiroGrande.Clone();			
		}
		return null;
	}
}
