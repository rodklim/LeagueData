package rojos.leaguedata.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rojos.leaguedata.R;

/**
 * Created by Rodrigo on 5/29/2017.
 */

public class BlurbFragment extends Fragment {

    TextView textView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.blurb_fragment, container, false);
        Bundle bundle = getArguments();
        textView = (TextView) v.findViewById(R.id.blurb);
        textView.setText(bundle.getString("blurb"));
        return v;
    }
}
