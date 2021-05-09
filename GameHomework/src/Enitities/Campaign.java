package Enitities;

public class Campaign {
	
	private int id;
	private String campanignName;
	private String campaignNumber;
	private double campaignPercent;
	
	public Campaign(int id, String campanignName, String campaignNumber, double campaignPercent) {
		this.id = id;
		this.campanignName = campanignName;
		this.campaignNumber = campaignNumber;
		this.campaignPercent = campaignPercent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampanignName() {
		return campanignName;
	}

	public void setCampanignName(String campanignName) {
		this.campanignName = campanignName;
	}

	public String getCampaignNumber() {
		return campaignNumber;
	}

	public void setCampaignNumber(String campaignNumber) {
		this.campaignNumber = campaignNumber;
	}

	public double getCampaignPercent() {
		return campaignPercent;
	}

	public void setCampaignPercent(double campaignPercent) {
		this.campaignPercent = campaignPercent;
	}
	
	
	
}
