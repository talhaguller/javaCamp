package Concrete;

import Abstracts.GameService;
import Enitities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyununuz eklenmiştir : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyununuz silinmiştir : " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyununuz güncellenmiştir : " + game.getGameName());
		
	}



}
