package one.digitalinnovation.gof.singleton;

/**
 * Singleton "hasty"
 * 
 * @author s4u1o
 *
 */
public class SingletonEager {

		private static SingletonEager instancia = new SingletonEager();
		
		private SingletonEager() {
			super();
		}
		
		public static SingletonEager getInstacia() {
			return instancia;
		}
		
	}