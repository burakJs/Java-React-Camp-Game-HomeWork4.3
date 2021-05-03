import managers.CampaignManager;
import managers.GameManager;
import managers.GamerManager;
import models.Campaign;
import models.Game;
import models.Gamer;
import verifications.EDevletVerification;

public class Main {

	public static void main(String[] args) {
		Campaign campaign = new Campaign(1, "Gel al %15 indirim", 15, true);
		Game game = new Game(1, "Need For Speed 10", 150);
		Gamer gamer = new Gamer(1, "Burak", "İmdat", "01-02-2001", "12332143343");
		
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager(campaign);
		GamerManager gamerManager = new GamerManager(new EDevletVerification());
		
		campaignManager.deleteCampaign(campaign);
		campaignManager.addCampaign(campaign);
		campaignManager.updateCampaign(campaign, 2, "Gel Al %20 indirim", 20, true);
		System.out.println("Güncellendikten sonra : "+campaign.getName());
		
		gameManager.sellGame(gamer, game);
		
		gamerManager.addGamer(gamer);
		gamerManager.deleteGamer(gamer);
		gamerManager.updateGamer(gamer, 2, "Burak2", "İmdat2", "98778998765", "09-08-2001");
		System.out.println("Güncellendikten sonra : "+gamer.getFirstName());
	}

}
