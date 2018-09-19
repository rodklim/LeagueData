package rojos.leaguedata.tablayout;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import rojos.leaguedata.fragments.BlurbFragment;
import rojos.leaguedata.fragments.SpellsFragment;
import rojos.leaguedata.fragments.TipsFragment;
import rojos.leaguedata.data.ChampionData.ChampionDto;
import rojos.leaguedata.data.ChampionData.ChampionSpellDto;

/**
 * Created by Rodrigo on 5/28/2017.
 */

public class ChampionViewPagerAdapter extends FragmentStatePagerAdapter{

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created
    String blurb;
    List<ChampionSpellDto> spells;
    List<String> allyTips;
    List<String> enemyTips;
    Context mContext;
    ChampionDto championDto;

    public ChampionViewPagerAdapter(FragmentManager fm, CharSequence[] titles, int numbOfTabs, ChampionDto championDto) {
        super(fm);
        Titles = titles;
        NumbOfTabs = numbOfTabs;
        this.championDto = championDto;
    }

    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ChampionViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        Fragment fragment;

        switch(position) {
            case 0:
                Bundle blurbBundle = new Bundle();
                blurbBundle.putString("blurb", championDto.getLore());
                fragment = new BlurbFragment();
                fragment.setArguments(blurbBundle);
                return fragment;
            case 1:
                SpellsFragment spellsFragment = new SpellsFragment();
                spellsFragment.setChampionSpells(championDto.getSpells());
                spellsFragment.setChampionPassive(championDto.getPassive());
                return spellsFragment;
            case 2:
                TipsFragment tipsFragment = new TipsFragment();
                tipsFragment.setAllyTips(championDto.getAllytips());
                tipsFragment.setEnemyTips(championDto.getEnemyTips());
                return tipsFragment;
        }
        return null;
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
