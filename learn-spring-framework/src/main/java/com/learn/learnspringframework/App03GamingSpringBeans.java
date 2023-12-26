package com.learn.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.learn.learnspringframework.game.GameRunner;
import com.learn.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
		
	}

}
