package componente.cabine;

public class CabineAbstrata implements Cabine {

	protected int Capacidade;
	
	public int getCapacidade(){
		return this.Capacidade;
	}
		
	
	
	@Override
	public Cabine clone() {
		
		try{
			return (Cabine) super.clone();	
		}
		catch(Exception e){
			return null;
		}
	}
}
