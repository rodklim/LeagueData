package rojos.leaguedata.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import rojos.leaguedata.retrofit.EndpointsURL;
import rojos.leaguedata.R;
import rojos.leaguedata.utils.StringUtils;
import rojos.leaguedata.datamodels.ChampionDataModel;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class ChampionListAdapter extends RecyclerView.Adapter<ChampionListAdapter.ChampionListViewHolder>{

    public Context mContext;
    List<ChampionDataModel> championDataList;
    public OnItemClickListener mItemClickListener;

    public ChampionListAdapter(Context context, List<ChampionDataModel> championDataList) {
        this.mContext = context;
        this.championDataList = championDataList;
    }

    @Override
    public ChampionListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View championView = inflater.inflate(R.layout.champion_list_item, parent, false);
        return new ChampionListViewHolder(championView);
    }

    @Override
    public void onBindViewHolder(ChampionListViewHolder holder, int position) {
        ChampionDataModel championData = championDataList.get(position);
        holder.championName.setText(championData.getName());
        holder.championName.setTextColor(Color.RED);
        holder.championName.setTextSize(12);
        holder.championID = championData.getId();
        Glide.with(mContext).load(StringUtils.buildUrl(EndpointsURL.CHAMPION_ICON, championData.getImageDto().getFull())).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return championDataList.size();
    }

    public class ChampionListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView championName;
        ImageView imageView;
        long championID;

        public ChampionListViewHolder(final View itemView) {
            super(itemView);
            final Context context;
            championName = (TextView) itemView.findViewById(R.id.champion_name);
            imageView = (ImageView) itemView.findViewById(R.id.champion_image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mItemClickListener.onItemClick(v,getAdapterPosition(),championID);
        }
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int position, long championID);
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }
}
