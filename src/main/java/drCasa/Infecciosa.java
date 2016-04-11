package drCasa;

import java.math.BigDecimal;

public class Infecciosa implements Contagiable {
	
	//Variables
	private BigDecimal celulasAmenazadas;
	
	//Constructor
	public Infecciosa(BigDecimal unasCelulas){
		
		this.celulasAmenazadas = unasCelulas;
		
	}

	//Getters
	public BigDecimal getCelulasAmenazadas(){
		
		return this.celulasAmenazadas;
		
	}
	
	//Metodos Abstractos
	public boolean esAgresiva(Persona unaPersona){
		
		return (unaPersona.getCelulasTotales().doubleValue() * 0.10) > this.celulasAmenazadas.doubleValue(); 
	
	}
	
	public void afectarA(Persona unaPersona){
		unaPersona.subirTemperatura(celulasAmenazadas.divide(BigDecimal.valueOf(1000)));
	}
	
	public void atenuarse(){
		
	}
	
	public void reproducirse(){
		
		this.celulasAmenazadas = this.celulasAmenazadas.multiply(BigDecimal.valueOf(2));
	
	}

}
