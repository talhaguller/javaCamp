package Concrete;

import Abstracts.GamerService;
import Enitities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklenmiþtir : " + gamer.getGamerFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silinmiþtir : " + gamer.getGamerFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellenmiþtir : " + gamer.getGamerFirstName());
		
	}

}
