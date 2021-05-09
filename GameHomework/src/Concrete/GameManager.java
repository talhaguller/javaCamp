package Concrete;

import Abstracts.GameService;
import Enitities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyununuz eklenmiþtir : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyununuz silinmiþtir : " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyununuz güncellenmiþtir : " + game.getGameName());
		
	}



}
