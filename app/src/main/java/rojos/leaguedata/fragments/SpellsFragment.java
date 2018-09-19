package rojos.leaguedata.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import rojos.leaguedata.adapters.ChampionListAdapter;
import rojos.leaguedata.adapters.ChampionSpellsAdapter;
import rojos.leaguedata.data.ChampionData.PassiveDto;
import rojos.leaguedata.retrofit.EndpointsURL;
import rojos.leaguedata.R;
import rojos.leaguedata.utils.StringUtils;
import rojos.leaguedata.data.ChampionData.ChampionSpellDto;

/**
 * Created by Rodrigo on 5/29/2017.
 */

public class SpellsFragment extends Fragment {
    TextView passiveNameTextView;
    TextView passiveDescriptionTextView;
    ImageView passiveImageView;
    LinearLayout spellsLL;
    List<ChampionSpellDto> championSpells;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private ChampionSpellsAdapter adapter;
    private PassiveDto passiveDto;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.spells_fragment, container, false);
        passiveNameTextView = (TextView) v.findViewById(R.id.passive_name);
        passiveImageView = (ImageView) v.findViewById(R.id.passive_image);
        passiveDescriptionTextView = (TextView) v.findViewById(R.id.passive_description);
        spellsLL = (LinearLayout) v.findViewById(R.id.spells_ll);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.championSpellsRecyclerView);
        mLinearLayoutManager = new LinearLayoutManager(getContext());
        mLinearLayoutManager.setStackFromEnd(false);
        championSpells.add(convertChampionPassiveToChampionSpell(passiveDto));
        adapter = new ChampionSpellsAdapter(getContext(), championSpells);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(adapter);
        return v;
    }

    public void setChampionSpells(List<ChampionSpellDto> championSpells) {
        this.championSpells = championSpells;
    }

    public void setChampionPassive(PassiveDto passiveDto) {
        this.passiveDto = passiveDto;
    }

    private ChampionSpellDto convertChampionPassiveToChampionSpell(PassiveDto passiveDto) {
        ChampionSpellDto championSpellDto = new ChampionSpellDto();
        championSpellDto.setName(passiveDto.getName());
        championSpellDto.setSanitizedDescription(passiveDto.getSanitizedDescription());
        championSpellDto.setImage(passiveDto.getImageDto());
        return championSpellDto;
    }
}
