package adapters;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.script.expensify.R;
import models.Category;

import java.util.List;

public class CategorySelectAdapter extends RecyclerView.Adapter<CategorySelectAdapter.CategoryViewHolder> {

    private List<Category> categoryList;

    public CategorySelectAdapter(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_category_recycler, parent, false);

        return new CategoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        holder.textViewCategory.setText(categoryList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        Log.v(CategoryAdapter.class.getSimpleName(),""+categoryList.size());
        return categoryList.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    /**
     * ViewHolder class
     */

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        public AppCompatTextView textViewCategory;

        public CategoryViewHolder(View view) {
            super(view);
            textViewCategory = (AppCompatTextView) view.findViewById(R.id.textViewCategory);
        }
    }
}
