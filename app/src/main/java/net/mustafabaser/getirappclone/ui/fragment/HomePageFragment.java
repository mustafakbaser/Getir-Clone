package net.mustafabaser.getirappclone.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;

import net.mustafabaser.getirappclone.R;
import net.mustafabaser.getirappclone.data.entity.Campaigns;
import net.mustafabaser.getirappclone.databinding.FragmentHomePageBinding;
import net.mustafabaser.getirappclone.ui.adapter.CampaingsAdapter;

import java.util.ArrayList;

public class HomePageFragment extends Fragment {
    private FragmentHomePageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomePageBinding.inflate(inflater, container, false);

        binding.DeliveryAddressLayout.setOnClickListener(v -> {
            Snackbar.make(v, "Estimated Arrival Time: 5 mins to your location", Snackbar.LENGTH_SHORT).show();
        });

        // Campaings
        binding.recyclerViewCampaigns
                .setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        ArrayList<Campaigns> campaignsList = new ArrayList<>();
        Campaigns campaign1 = new Campaigns("Campaing 1", "slider_1");
        Campaigns campaign2 = new Campaigns("Campaing 2", "slider_2");
        Campaigns campaign3 = new Campaigns("Campaing 3", "slider_3");
        campaignsList.add(campaign1);
        campaignsList.add(campaign2);
        campaignsList.add(campaign3);

        CampaingsAdapter campaingsAdapter = new CampaingsAdapter(campaignsList, requireContext());
        binding.recyclerViewCampaigns.setAdapter(campaingsAdapter);

        // Categories

        return binding.getRoot();
    }
}