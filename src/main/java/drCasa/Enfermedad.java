package drCasa;

import java.math.BigDecimal;

public abstract class Enfermedad {
	
	//Variables
	protected BigDecimal celulasAmenazadas;
	
	//Metodos abstractos
	public abstract boolean esAgresiva(Persona unaPersona);
	
	public abstract void afectarA(Persona unaPersona);
	
	//Metodos	
	public BigDecimal getCelulasAmenazadas(){
		
		return this.celulasAmenazadas;
		
	}
	
	//Falta hacer
	public void atenuarse(){
		
	}

}
