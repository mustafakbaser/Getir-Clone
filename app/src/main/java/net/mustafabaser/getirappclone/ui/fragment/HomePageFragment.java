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
import net.mustafabaser.getirappclone.data.entity.Categories;
import net.mustafabaser.getirappclone.databinding.FragmentHomePageBinding;
import net.mustafabaser.getirappclone.ui.adapter.CampaingsAdapter;
import net.mustafabaser.getirappclone.ui.adapter.CategoriesAdapter;

import java.util.ArrayList;

public class HomePageFragment extends Fragment {
    private FragmentHomePageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomePageBinding.inflate(inflater, container, false);

        binding.DeliveryAddressLayout.setOnClickListener(v -> {
            Snackbar.make(v, "Estimated arrival time: " + getResources()
                    .getString(R.string.estimated_time_example) + " mins to your location", Snackbar.LENGTH_SHORT)
                    .show();
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
        binding.recyclerViewCategories.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL));
        ArrayList<Categories> categoryList = new ArrayList<>();
        Categories category1 = new Categories(getResources().getString(R.string.discounts),"category_1");
        Categories category2 = new Categories(getResources().getString(R.string.bakery),"category_2");
        Categories category3 = new Categories(getResources().getString(R.string.fruits_vegetables),"category_3");
        Categories category4 = new Categories(getResources().getString(R.string.groceries),"category_4");
        Categories category5 = new Categories(getResources().getString(R.string.water_beverages),"category_5");
        Categories category6 = new Categories(getResources().getString(R.string.snacks),"category_6");
        Categories category7 = new Categories(getResources().getString(R.string.ice_cream),"category_7");
        Categories category8 = new Categories(getResources().getString(R.string.dairy_products),"category_8");
        Categories category9 = new Categories(getResources().getString(R.string.breakfast),"category_9");
        Categories category10 = new Categories(getResources().getString(R.string.home_care),"category_10");
        Categories category11 = new Categories(getResources().getString(R.string.fitness_wellness),"category_11");
        Categories category12 = new Categories(getResources().getString(R.string.ready_to_eat),"category_12");
        categoryList.add(category1);
        categoryList.add(category2);
        categoryList.add(category3);
        categoryList.add(category4);
        categoryList.add(category5);
        categoryList.add(category6);
        categoryList.add(category7);
        categoryList.add(category8);
        categoryList.add(category9);
        categoryList.add(category10);
        categoryList.add(category11);
        categoryList.add(category12);

        CategoriesAdapter categoriesAdapter = new CategoriesAdapter(categoryList, requireContext());
        binding.recyclerViewCategories.setAdapter(categoriesAdapter);

        return binding.getRoot();
    }
}