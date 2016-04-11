package drCasa;

import java.math.BigDecimal;

public class AutoInmune implements Contagiable {
	
	//Variables
	private BigDecimal celulasAmenazadas;
	private Integer diasAfectando;
	
	//Constructor
	public AutoInmune(BigDecimal unasCelulas){
		
		this.celulasAmenazadas = unasCelulas;
		this.diasAfectando = 0;
		
	}
	
	//Getters
	public BigDecimal getCelulasAmenazadas(){
		
		return this.celulasAmenazadas;
		
	}
	
	//Metodos Abstractos
 	public boolean esAgresiva(Persona unaPersona){
		
		return (diasAfectando > 30);
		
	}
	
	public void afectarA(Persona unaPersona) {
		
		unaPersona.destruirCelulas(this.celulasAmenazadas);
		this.diasAfectando++;
		
	}
	
	public void atenuarse(){
		
	}
	
}
