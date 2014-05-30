package componente.motor;

public class MotorDuplo extends MotorAbstrato {

	public MotorDuplo(int potencia){
		this.setPotencia(potencia*2);
		this.setTipo("Duplo");
	}
	
	public Object Clone(){
		return this;
	}
}
