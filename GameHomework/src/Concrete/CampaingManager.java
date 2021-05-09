package Concrete;

import Abstracts.CampaignService;
import Enitities.Campaign;

public class CampaingManager implements CampaignService {

	@Override
	public void add(Campaign compaign) {
		System.out.println("Kampanyanýz eklenmiþtir : " + compaign.getCampanignName());
	}

	@Override
	public void delete(Campaign compaign) {
		System.out.println("Kampanyanýz silinmiþtir : " + compaign.getCampanignName());
		
	}

	@Override
	public void update(Campaign compaign) {
		System.out.println("Kampanyanýz güncellenmiþtir : " + compaign.getCampanignName());
		
	}

}
//