package net.mustafabaser.getirappclone.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.mustafabaser.getirappclone.data.entity.Categories;
import net.mustafabaser.getirappclone.databinding.CategoryCardDesignBinding;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CardDesignHolder> {
    private List<Categories> categoryList;
    private Context mContext;

    public CategoriesAdapter(List<Categories> categoryList, Context mContext) {
        this.categoryList = categoryList;
        this.mContext = mContext;
    }

    public class CardDesignHolder extends RecyclerView.ViewHolder{
        private CategoryCardDesignBinding categoryCardDesignBinding;

        CardDesignHolder(CategoryCardDesignBinding designBinding){
            super(designBinding.getRoot());
            this.categoryCardDesignBinding = designBinding;
        }
    }

    @NonNull
    @Override
    public CardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CategoryCardDesignBinding categoryCardDesignBinding = CategoryCardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new CardDesignHolder(categoryCardDesignBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.CardDesignHolder holder, int position) {
        Categories category = categoryList.get(position);
        CategoryCardDesignBinding categoryCardDesignBinding = holder.categoryCardDesignBinding;

        // Category Banner
        categoryCardDesignBinding.imageViewCategoryBanner.setImageResource(
                mContext.getResources()
                        .getIdentifier(category.getCategoryBanner(), "drawable", mContext.getPackageName()));

        // Category Title
        categoryCardDesignBinding.textViewCategoryTitle.setText(category.getCategoryName());
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
