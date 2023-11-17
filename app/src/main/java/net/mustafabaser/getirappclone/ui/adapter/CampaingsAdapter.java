package net.mustafabaser.getirappclone.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.mustafabaser.getirappclone.data.entity.Campaigns;
import net.mustafabaser.getirappclone.databinding.SliderCardDesignBinding;

import java.util.List;

public class CampaingsAdapter extends RecyclerView.Adapter<CampaingsAdapter.CardDesignHolder> {
    private List<Campaigns> campaignsList;
    private Context mContext;

    public CampaingsAdapter(List<Campaigns> campaignsList, Context mContext) {
        this.campaignsList = campaignsList;
        this.mContext = mContext;
    }

    public class CardDesignHolder extends RecyclerView.ViewHolder{
        private SliderCardDesignBinding binding;

        CardDesignHolder(SliderCardDesignBinding designBinding){
            super(designBinding.getRoot());
            this.binding = designBinding;
        }
    }


    @NonNull
    @Override
    public CardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        SliderCardDesignBinding binding = SliderCardDesignBinding.inflate(LayoutInflater.from(mContext),parent, false);
        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CampaingsAdapter.CardDesignHolder holder, int position) {
        Campaigns campaign = campaignsList.get(position);
        SliderCardDesignBinding binding = holder.binding;

        // Campaing Banner
        binding.imageViewCampaign.setImageResource(
                mContext.getResources()
                        .getIdentifier(campaign.getCampaignBanner(),"drawable", mContext.getPackageName())
        );
    }

    @Override
    public int getItemCount() {
        return campaignsList.size();
    }
}
