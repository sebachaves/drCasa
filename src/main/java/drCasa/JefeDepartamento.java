package drCasa;

import java.math.BigDecimal;
import java.util.ArrayList;

public class JefeDepartamento extends Medico {
	
	//Variables
	private ArrayList<Medico> subordinados;
	
	//Constructor
	public JefeDepartamento(BigDecimal unaTemperatura, BigDecimal unasCelulas, BigDecimal unaDosis){
		
		super(unaTemperatura, unasCelulas, unaDosis);
		
		this.subordinados = new ArrayList<Medico>();
		
	}
	
	//Metodos
	public void agregarSubordinado(Medico unMedico){
		
		this.subordinados.add(unMedico);
		
	}

}
