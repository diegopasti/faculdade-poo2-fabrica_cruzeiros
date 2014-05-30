package componente.motor;

import componente.Componente;

public interface Motor extends Componente {
	public int getPotencia();
	public void setPotencia(int potencia);
	
	public void setTipo(String tipo);
	public String getTipo();
}
