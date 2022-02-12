package one.digitalinnovation.gof.facade;
/**
 * Facade
 * 
 * @author s4u10
 *
 */
import subsystem1.crm.CrmService;
import subsystem2.cep.CepApi;

public class Facade {
	
	public void migrateClient(String name, String cep) {
		
		String city = CepApi.getInstacia().recoverCity(cep);
		String state = CepApi.getInstacia().recoverState(city);
		

		CrmService.recordClient(name, cep, city, state);
	}

}
