package drCasa;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPersona {
	
	//Variables
	public Infecciosa unaMalaria;
	public Infecciosa otraMalaria;
	public Infecciosa unaOtitis;
	public AutoInmune unLupus;
	public Persona logan;
	public Persona frank;
	
	//Before
	@Before
	public void init(){
		
		//Enfermedades
		this.unaMalaria = new Infecciosa(BigDecimal.valueOf(500));
		this.unaOtitis = new Infecciosa(BigDecimal.valueOf(100));
		this.unLupus = new AutoInmune(BigDecimal.valueOf(10000));
		this.otraMalaria = new Infecciosa(BigDecimal.valueOf(800));
		
		//Personas
		logan = new Persona(BigDecimal.valueOf(36), BigDecimal.valueOf(3000000));
		logan.contraerEnfermedad(unaMalaria);
		logan.contraerEnfermedad(unaOtitis);
		logan.contraerEnfermedad(unLupus);
		
		frank = new Persona(BigDecimal.valueOf(36), BigDecimal.valueOf(3500000));
		frank.contraerEnfermedad(otraMalaria);
		
	}
	
	//Tests
	@Test
	public void testEnfermedadInfecciosaSabeSiEsAgresivaParaFrank(){
		
		assertTrue(unaMalaria.esAgresiva(frank));
		
	}
	
	@Test 
	public void testEnfermedadAutoInmuneSabeSiEsAgresivaParaFrank(){
		
		assertFalse(unLupus.esAgresiva(frank));
		
	}
	
	@Test
	public void testLoganContrajoBienUnaEnfermedadAutoInmune(){
		
		logan.vivirUnDia();

		assertEquals(2990000, logan.getCelulasTotales().intValue());
		
	}
	
	@Test
	public void testLoganContrajoBienLasEnfermedadesInfecciosas(){
		
		logan.vivirUnDia();
		
		assertEquals(36.6, logan.getTemperatura().doubleValue(), 0.10);
		
	}
	
	@Test
	public void testFrankContrajoBienLaMalaria(){
		
		frank.vivirUnDia();
		
		assertEquals(36.8, frank.getTemperatura().doubleValue(), 0.10);
		
	}
	
	@Test
	public void testLaMalariaSeReproduceBien(){
		
		unaMalaria.reproducirse();
		
		assertEquals(1000, unaMalaria.getCelulasAmenazadas().intValue());
		
	}
	
	@Test
	public void testLoganCalculaBienLasCelulasAmenazadasPorEnfermedadesAgresivas(){
		
		logan.vivirUnDia();
		
		assertEquals(600 ,logan.celulasAfectadasPorEnfermedadesAgresivas().intValue());
		
	}
	
	@Test
	public void testLoganSabeQueEnfermedadLeAfectaMasCelulas(){
		
		logan.vivirUnDia();
		
		assertTrue(logan.laEnfermedadQueMasCelulasAfecta().equals(unLupus));
		
	}

	@Test
	public void testSaberSiLoganEntraEnComaPasadoUnDia(){
		
		logan.vivirUnDia();
		
		assertFalse(logan.getEstoyEnComa());
		
	}
	
	@Test
	public void testHacerQueLoganVivaTreintaYUnDias(){
		
		logan.vivirVariosDias(31);
		
		assertEquals(44.9, logan.getTemperatura().doubleValue(), 0);
		
	}
	
	@Test
	public void testLasEnfermedadesSabenAtenuarse(){
		
		unaMalaria.atenuarse(BigDecimal.valueOf(100));
		
		assertEquals(400, unaMalaria.getCelulasAmenazadas().intValue());
		
	}
	
	
	
}
