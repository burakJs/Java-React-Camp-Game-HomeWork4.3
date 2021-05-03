package managers;

import interfaces.BaseGameManager;
import models.Campaign;
import models.Game;
import models.Gamer;

public class GameManager implements BaseGameManager{
	
	final Campaign campaign;

	public GameManager(Campaign campaign) {
		this.campaign = campaign;
	}

	@Override
	public void sellGame(Gamer gamer, Game game) {
		double gameMoney = game.getPrice();
		if(campaign.isActive()) {
			gameMoney -= gameMoney * campaign.getDisCount() / 100;
		}
		System.out.println(gamer.getFirstName() + " oyunu " + gameMoney + "TL'ye "+campaign.getName() +" ile satın aldı");
	}

	
	
}
