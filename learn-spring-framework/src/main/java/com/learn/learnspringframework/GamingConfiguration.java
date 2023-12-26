package com.learn.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.learnspringframework.game.GameRunner;
import com.learn.learnspringframework.game.GamingConsole;
import com.learn.learnspringframework.game.PacManGame;

@Configuration
public class GamingConfiguration {
		
		@Bean
		public GamingConsole game() {
			var game = new PacManGame();
			return game;
		}
		
		@Bean
		public GameRunner gameRunner(GamingConsole game) {
			var gameRunner = new GameRunner(game);
			return gameRunner;
		}
		
}
