package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Behavior;
import one.digitalinnovation.gof.strategy.BehaviorAggressive;
import one.digitalinnovation.gof.strategy.BehaviorDefensive;
import one.digitalinnovation.gof.strategy.BehaviorNormal;
import one.digitalinnovation.gof.strategy.Robo;

/**
 * Singleton "Tests Related to the Singleton Design Pattern ".
 * 
 * @author s4u10
 *
 */

public class Test {
	
	public static void main(String[] args) {
		
		// Singletonn
		
		SingletonLazy lazy = SingletonLazy.getInstacia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstacia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstacia();
		System.out.println(eager);
		eager = SingletonEager.getInstacia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstacia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstacia();
		System.out.println(holder);
		
		// Strategy
		
		Behavior defensive = new BehaviorDefensive();
		Behavior normal = new BehaviorNormal();
		Behavior aggressivo = new BehaviorAggressive();
		
		Robo robo = new Robo();
		
		robo.setBehavior(normal);
		robo.move();
		robo.move();
		
		robo.setBehavior(defensive);
		robo.move();
		
		robo.setBehavior(aggressivo);
		robo.move();
		robo.move();
		robo.move();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrateClient("Saulo", "30672-772");
		
	}


}
