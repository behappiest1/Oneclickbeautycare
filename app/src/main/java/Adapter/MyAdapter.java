package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.ocbc.behappiest.oneclickbeautycare.DisplayActivity;
import com.ocbc.behappiest.oneclickbeautycare.R;

import java.util.List;

import Model.ListItem;

/**
 * Created by behappiest on 14-Jan-18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<ListItem> ListItems;


    public MyAdapter(Context context, List listitem) {
        this.context = context;
        this.ListItems = listitem;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, final int position) {
        ListItem items = ListItems.get(position);
        holder.name.setText(items.getName());
    }

    @Override
    public int getItemCount() {
        return ListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            name = (TextView) itemView.findViewById(R.id.lineartitleID);

        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            ListItem item = ListItems.get(position);
            Intent intent = new Intent(context, DisplayActivity.class);
            intent.putExtra("title", item.getName());
            if (intent != null) {
                context.startActivity(intent);
            }
        }
    }
}
