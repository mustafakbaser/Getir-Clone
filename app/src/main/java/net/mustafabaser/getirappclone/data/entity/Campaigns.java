package net.mustafabaser.getirappclone.data.entity;

import java.io.Serializable;

public class Campaigns implements Serializable {
    private String champaignName;
    private String campaignBanner;


    public Campaigns() {
    }

    public Campaigns(String champaignName, String campaignBanner) {
        this.champaignName = champaignName;
        this.campaignBanner = campaignBanner;
    }

    public String getChampaignName() {
        return champaignName;
    }

    public void setChampaignName(String champaignName) {
        this.champaignName = champaignName;
    }

    public String getCampaignBanner() {
        return campaignBanner;
    }

    public void setCampaignBanner(String campaignBanner) {
        this.campaignBanner = campaignBanner;
    }
}


