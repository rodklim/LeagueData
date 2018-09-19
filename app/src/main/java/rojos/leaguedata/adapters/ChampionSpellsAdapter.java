package rojos.leaguedata.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import rojos.leaguedata.R;
import rojos.leaguedata.data.ChampionData.ChampionSpellDto;
import rojos.leaguedata.data.ChampionData.PassiveDto;
import rojos.leaguedata.retrofit.EndpointsURL;
import rojos.leaguedata.utils.StringUtils;

/**
 * Created by Rodrigo on 6/30/2017.
 */

public class ChampionSpellsAdapter extends RecyclerView.Adapter<ChampionSpellsAdapter.ChampionSpellsViewHolder> {


    Context mContext;
    List<ChampionSpellDto> championSpellDtos;

    public ChampionSpellsAdapter(Context context, List<ChampionSpellDto> championSpellDtos) {
        this.mContext = context;
        this.championSpellDtos = championSpellDtos;
    }

    @Override
    public ChampionSpellsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.champion_spell_item, parent, false);
        return new ChampionSpellsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ChampionSpellsViewHolder holder, int position) {
        //TODO Add passive to this adapter
        ChampionSpellDto championSpellDto = championSpellDtos.get(position);
        holder.spellName.setText(championSpellDto.getName());
        holder.spellDescription.setText(championSpellDto.getSanitizedDescription());
        if(!championSpellDto.getImage().getFull().contains("passive")) {
            Glide.with(mContext).load(StringUtils.buildUrl(EndpointsURL.SPELLS_ART, championSpellDto.getImage().getFull())).into(holder.spellImageView);
        } else {
            Glide.with(mContext).load(StringUtils.buildUrl(EndpointsURL.PASSIVE_ART, championSpellDto.getImage().getFull())).into(holder.spellImageView);
        }
    }

    @Override
    public int getItemCount() {
        return championSpellDtos.size();
    }

    public class ChampionSpellsViewHolder extends RecyclerView.ViewHolder{

        TextView spellName;
        ImageView spellImageView;
        TextView spellDescription;

        public ChampionSpellsViewHolder(final View itemView) {
            super(itemView);
            final Context context;
            spellName = (TextView) itemView.findViewById(R.id.spell_name);
            spellImageView = (ImageView) itemView.findViewById(R.id.spell_image);
            spellDescription = (TextView) itemView.findViewById(R.id.spells_description);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(spellDescription.getVisibility() == View.GONE) {
                        spellDescription.setVisibility(View.VISIBLE);
                    } else {
                        spellDescription.setVisibility(View.GONE);
                    }
                }
            });
        }
    }
}
