package interfaces;

import models.Campaign;

public interface BaseCampaignManager {
	void addCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign,int id,String name,double disCount,boolean isActive);
	void deleteCampaign(Campaign campaign);
}
