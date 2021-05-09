import java.time.LocalDate;

import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Enitities.Campaign;
import Enitities.Game;
import Enitities.Gamer;

public class Maýn {

	public static void main(String[] args) {
		
		GameManager gameManager = new GameManager();
		Game game =new Game(1,"Asasing Creed","Aksiyon",1500);
		gameManager.add(game);
		
		
		GamerManager gamerManager = new GamerManager();
		Gamer gamer = new Gamer(1, "Talha", "Güller", LocalDate.of(2000, 10, 5),"11111111111");
		gamerManager.add(gamer);
		
		CampaingManager campaingManager = new CampaingManager();
		Campaign campaign = new Campaign(3, "Hafta Sonu", "11", 10);
		campaingManager.add(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game, gamer, campaign);
	}

}
