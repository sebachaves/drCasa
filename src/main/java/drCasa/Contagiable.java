package drCasa;

import java.math.BigDecimal;

public interface Contagiable {
	
	//Metodos Abstractos
	public abstract boolean esAgresiva(Persona unaPersona);
	public abstract void afectarA(Persona unaPersona);
	public abstract void atenuarse();
	public BigDecimal getCelulasAmenazadas();
	
}
