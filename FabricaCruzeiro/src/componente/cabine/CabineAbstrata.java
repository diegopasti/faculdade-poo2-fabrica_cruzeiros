package componente.cabine;

public class CabineAbstrata implements Cabine {

	protected int Capacidade;
	
	public int getCapacidade(){
		return this.Capacidade;
	}
	
	@Override
	public Object Clone() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
