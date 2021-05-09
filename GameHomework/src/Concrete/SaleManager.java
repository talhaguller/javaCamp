package Concrete;

import Abstracts.SaleService;
import Enitities.Campaign;
import Enitities.Game;
import Enitities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		
		double discountPrice = game.getGamePrice() - (game.getGamePrice() * campaign.getCampaignPercent() / 100);

		
		System.out.println(game.getGameName() + " oyununu " + gamer.getGamerFirstName() +" "+gamer.getGamerLastName() +
				" adlý kiþisi oyunu " + discountPrice + " TL 'ye satýn aldý ");
	}

}
