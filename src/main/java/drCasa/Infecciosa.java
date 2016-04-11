package drCasa;

import java.math.BigDecimal;

public class Infecciosa extends Enfermedad {

	//Constructor
	public Infecciosa(BigDecimal unasCelulas){
		
		this.celulasAmenazadas = unasCelulas;
		
	}

	//Metodos Abstractos
	public boolean esAgresiva(Persona unaPersona){
		
		return (unaPersona.getCelulasTotales().doubleValue() * 0.10) > this.celulasAmenazadas.doubleValue(); 
	
	}
	
	public void afectarA(Persona unaPersona){
		
		unaPersona.subirTemperatura(celulasAmenazadas.divide(BigDecimal.valueOf(1000)));
	
	}
	
	//Metodos
	public void reproducirse(){
		
		this.celulasAmenazadas = this.celulasAmenazadas.multiply(BigDecimal.valueOf(2));
	
	}

}
