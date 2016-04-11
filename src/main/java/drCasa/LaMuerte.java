package drCasa;

public class LaMuerte extends Enfermedad {
	
	//Metodos Abstractos
	public void afectarA(Persona unaPersona){
		
		unaPersona.morir();
		
	}

	public boolean esAgresiva(Persona unaPersona) {

		return true;
		
	}
	

}
