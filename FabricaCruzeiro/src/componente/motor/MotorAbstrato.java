package componente.motor;

public class MotorAbstrato implements Motor{

	protected int Potencia;
	protected String Tipo;
	
	public int getPotencia() {
		return Potencia;
	}
	public void setPotencia(int potencia) {
		Potencia = potencia;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	@Override
	public Motor clone() {
		try{
			return (Motor) super.clone();	
		}
		catch(Exception e){
			return null;
		}
	}
	
}
