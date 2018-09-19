package rojos.leaguedata.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.IOException;

import rojos.leaguedata.presenters.ChampionPresenterImplementation;
import rojos.leaguedata.retrofit.EndpointsURL;
import rojos.leaguedata.presenters.LeagueContract;
import rojos.leaguedata.R;
import rojos.leaguedata.utils.StringUtils;
import rojos.leaguedata.data.ChampionData.ChampionDto;
import rojos.leaguedata.tablayout.SlidingTabLayout;
import rojos.leaguedata.tablayout.ChampionViewPagerAdapter;

/**
 * Created by Rodrigo on 5/29/2017.
 */

public class ChampionFragment extends Fragment implements LeagueContract.ChampionView {

    TextView championName;
    ImageView championImage;
    LinearLayout championLL;
    LinearLayout imageAndNameLL;
    TextView errorTextView;
    ViewPager pager;
    ChampionViewPagerAdapter championViewPagerAdapter;
    CharSequence tabTitles[]={"Info","Spells", "Tips"};
    int numberOfTabs = 3;
    SlidingTabLayout tabs;
    private ChampionPresenterImplementation championPresenter;
    public static String TAG = "CHAMP_FRAG";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.champion_fragment, container,false);
        championLL = (LinearLayout) v.findViewById(R.id.champion_linearLayout);
        imageAndNameLL = (LinearLayout) v.findViewById(R.id.champion_image_title_LL);
        championName = (TextView) v.findViewById(R.id.champion_name);
        championImage = (ImageView) v.findViewById(R.id.champion_sprite);
        errorTextView = (TextView) v.findViewById(R.id.error_textView);
        pager = (ViewPager) v.findViewById(R.id.pager);
        tabs = (SlidingTabLayout) v.findViewById(R.id.tabs);
        championPresenter = new ChampionPresenterImplementation(this);
        Bundle bundle = getArguments();
        championPresenter.loadChampionClicked(bundle.getLong("champion_id"));
        return v;
    }

    @Override
    public void showChampionData(ChampionDto championDto) {
        championName.setText(championDto.getName() + ": " +championDto.getTitle());
        Glide.with(getContext()).load(StringUtils.buildUrl(EndpointsURL.CHAMPION_SPLASH, getSplashName(championDto.getImage().getFull()))).into(championImage);
        setUpChampionTabs(championDto);
    }

    @Override
    public void showNoChampionDataAvailable() {
        errorTextView.setVisibility(View.VISIBLE);
    }

    private void setUpChampionTabs(ChampionDto championDto) {

        championViewPagerAdapter =  new ChampionViewPagerAdapter(getActivity().getSupportFragmentManager(),tabTitles,numberOfTabs,championDto);

        // Assigning ViewPager View and setting the adapter
        pager.setAdapter(championViewPagerAdapter);

        // Assigning the Sliding Tab Layout View
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return Color.CYAN;
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);
    }

    private String getSplashName(String name) {

        name = name.replace(".png","_0.jpg");

        return name;
    }

    private void getImage(String uri) throws IOException {
//        URL url = new URL(uri);
//        Bitmap bmp = Glide.with(this).asBitmap().load(uri).;
//        BitmapDrawable background = new BitmapDrawable(Glide.with(this).asBitmap().load(uri));
//        imageAndNameLL.setBackground(background);

    }
}
