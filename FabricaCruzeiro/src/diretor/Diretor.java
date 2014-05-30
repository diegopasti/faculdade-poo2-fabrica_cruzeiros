package diretor;

import construtor.ConstrutorCruzeiroAbstrato;
import cruzeiro.Cruzeiro;

public interface Diretor {

	public Cruzeiro ConstruirCruzeiro(ConstrutorCruzeiroAbstrato Construtor);
}
