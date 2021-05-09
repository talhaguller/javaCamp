package Concrete;

import Abstracts.GamerService;
import Enitities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklenmiştir : " + gamer.getGamerFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silinmiştir : " + gamer.getGamerFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellenmiştir : " + gamer.getGamerFirstName());
		
	}

}
