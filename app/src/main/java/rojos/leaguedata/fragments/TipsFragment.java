package rojos.leaguedata.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import rojos.leaguedata.R;

/**
 * Created by Rodrigo on 5/29/2017.
 */

public class TipsFragment extends Fragment {
    TextView allyTipsTextView;
    TextView enemyTipsTextView;
    List<String> allyTips;
    List<String> enemyTips;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tips_fragment, container, false);
        allyTipsTextView = (TextView) v.findViewById(R.id.allyTips);
        allyTipsTextView.setText(allyTips.get(0));
        enemyTipsTextView = (TextView) v.findViewById(R.id.enemyTips);
        enemyTipsTextView.setText(enemyTips.get(0));
        return v;
    }

    public void setAllyTips(List<String> allyTips) {
        this.allyTips = allyTips;
    }

    public void setEnemyTips(List<String> enemyTips) {
        this.enemyTips = enemyTips;
    }
}
