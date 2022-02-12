package subsystem1.crm;
/**
 * Facade
 * 
 * @author s4u10
 *
 */
public class CrmService {
	
	private CrmService() {
		super();
	}
	
	public static void recordClient(String name, String city, String state, String cep) {
		System.out.println("Customer registered int the system CRM");
		System.out.println(name);
		System.out.println(city);
		System.out.println(state);
		System.out.println(cep);
	}

}
