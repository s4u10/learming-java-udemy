package subsystem2.cep;
/**
 * Facade
 * 
 * @author s4u10
 *
 */

public class CepApi {
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstacia() {
		return instancia;
	}
	
	public String recoverCity(String city) {
		return "Belo Horizonte";
	}
	
	public String recoverState(String state) {
		return "MG";
	}
	
}
