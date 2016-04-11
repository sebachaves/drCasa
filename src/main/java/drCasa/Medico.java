package drCasa;

import java.math.BigDecimal;

public class Medico extends Persona {
	
	//Variables
	private BigDecimal dosisMedicamento;
	
	//Constructores
	public Medico(BigDecimal unaTemperatura, BigDecimal unasCelulas, BigDecimal unaDosis){
		
		super(unaTemperatura, unasCelulas);
		
		this.dosisMedicamento = unaDosis;
		
	}
	
}
