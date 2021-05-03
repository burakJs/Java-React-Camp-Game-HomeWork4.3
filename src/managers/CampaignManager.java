package managers;

import interfaces.BaseCampaignManager;
import models.Campaign;

public class CampaignManager implements BaseCampaignManager{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " adıyla kampanya oluşturuldu");
		
	}

	@Override
	public void updateCampaign(Campaign campaign, int id, String name, double disCount, boolean isActive) {
		campaign.setId(id);
		campaign.setName(name);
		campaign.setDisCount(disCount);
		campaign.setActive(isActive);
		
		System.out.println(campaign.getName() + " kampanya güncellendi");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " adıyla kampanya silindi");
	}

}
