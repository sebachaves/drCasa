package drCasa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Persona {
	
	//Variables
	private ArrayList<Enfermedad> enfermedades;
	private BigDecimal temperatura;
	private BigDecimal celulasTotales;
	
	//Constructores
	public Persona(BigDecimal unaTemperatura, BigDecimal unasCelulas){
		
		this.temperatura = unaTemperatura;
		this.celulasTotales = unasCelulas;
		this.enfermedades = new ArrayList<Enfermedad>();
		
	}
	
	//Getters
	public BigDecimal getCelulasTotales(){
		
		return this.celulasTotales;
		
	}
	
	//Metodos
	public void vivirUnDia(){
		
		enfermedades.forEach(enfermedad -> enfermedad.afectarA(this));
		
	}
	
	public void contraerEnfermedad(Enfermedad unaEnfermedad){
		
		this.enfermedades.add(unaEnfermedad);
		
	}
	
	public void destruirCelulas(BigDecimal unasCelulas){
		
		this.celulasTotales = this.celulasTotales.subtract(unasCelulas);
		
	}
	
	public void subirTemperatura(BigDecimal unaTemperatura){
		
		if(this.temperatura.add(unaTemperatura).intValue() <= 45){
			this.temperatura = this.temperatura.add(unaTemperatura);
		}
		else{
			this.entrarEnComa();
		}
		
	}
	
	public Integer celulasAfectadasPorEnfermedadesAgresivas(){
		
		Stream<Enfermedad> enfermedadesAgresivas = this.enfermedades.stream().filter(enfermedad -> enfermedad.esAgresiva(this));
		
		return Integer.valueOf(enfermedadesAgresivas.mapToInt(enfermedad -> enfermedad.getCelulasAmenazadas().intValue()).sum());
		
	}
	
	public Enfermedad laEnfermedadQueMasCelulasAfecta(){
		
		final Comparator<Enfermedad> comparador = (enfermedad1, enfermedad2) -> enfermedad1.getCelulasAmenazadas().compareTo(enfermedad2.getCelulasAmenazadas());
		
		return enfermedades.stream().max(comparador).get();
		
	}
	
	//Faltan hacer
	public void entrarEnComa(){
		
	}
	
	public void morir(){
		
	}
	
}
