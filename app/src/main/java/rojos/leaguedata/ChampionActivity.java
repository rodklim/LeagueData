package rojos.leaguedata;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import rojos.leaguedata.fragments.ChampionFragment;

/**
 * Created by Rodrigo on 6/17/2017.
 */

public class ChampionActivity extends BaseActivity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.champion_fragment_holder);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            Fragment fragment = new ChampionFragment();
            fragment.setArguments(bundle);
            setFragment(R.id.fragment_container,fragment, ChampionFragment.TAG);
        }
    }

}
