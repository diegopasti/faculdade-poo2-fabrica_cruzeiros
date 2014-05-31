package componente.bote;

public class BoteAbstrato implements Bote, Cloneable{

	public int capacidade=0;
	
	@Override
	public Bote clone() {
		try{
			return (Bote)super.clone();	
		}
		catch(Exception e){
			return null;
		}
	}

}
