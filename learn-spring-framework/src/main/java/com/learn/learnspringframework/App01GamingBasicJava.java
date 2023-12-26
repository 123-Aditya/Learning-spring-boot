package com.learn.learnspringframework;

import com.learn.learnspringframework.game.GameRunner;
import com.learn.learnspringframework.game.PacManGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
	}

}
