package Abstracts;

import Enitities.Campaign;
import Enitities.Game;
import Enitities.Gamer;

public interface SaleService {
	
	void sale(Game game, Gamer gamer, Campaign campaign );
	
}
