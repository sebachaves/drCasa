package drCasa;

import java.math.BigDecimal;

public class LaMuerte implements Contagiable {
	
	//Metodos Abstractos
	public boolean esAgresiva(Persona unaPersona){
		
		return true;
		
	}
	
	public void afectarA(Persona unaPersona){
		
		unaPersona.morir();
		
	}
	
	public void atenuarse(){
		
		
		
	}

	public BigDecimal getCelulasAmenazadas() {
		
		return BigDecimal.ZERO;
		
	}

}
