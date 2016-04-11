package drCasa;

import java.math.BigDecimal;

public class AutoInmune extends Enfermedad{
	
	//Variables
	private Integer diasAfectando;
	
	//Constructor
	public AutoInmune(BigDecimal unasCelulas){
		
		this.celulasAmenazadas = unasCelulas;
		this.diasAfectando = 0;
		
	}
	
	//Metodos Abstractos
 	public boolean esAgresiva(Persona unaPersona){
		
		return (diasAfectando > 30);
		
	}
	
	public void afectarA(Persona unaPersona) {
			
		unaPersona.destruirCelulas(this.celulasAmenazadas);
		this.diasAfectando++;
		
	}
	
}
