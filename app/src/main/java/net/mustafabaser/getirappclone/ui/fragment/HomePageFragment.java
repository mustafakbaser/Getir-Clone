package net.mustafabaser.getirappclone.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;

import net.mustafabaser.getirappclone.R;
import net.mustafabaser.getirappclone.databinding.FragmentHomePageBinding;

public class HomePageFragment extends Fragment {
    private FragmentHomePageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomePageBinding.inflate(inflater, container, false);

        binding.DeliveryAddressLayout.setOnClickListener(v -> {
            Snackbar.make(v, "Estimated Arrival Time: 5 mins to your location", Snackbar.LENGTH_SHORT).show();
        });

        return binding.getRoot();
    }
}