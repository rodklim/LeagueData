package rojos.leaguedata.fragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import rojos.leaguedata.ChampionActivity;
import rojos.leaguedata.adapters.ChampionListAdapter;
import rojos.leaguedata.presenters.ChampionPresenterImplementation;
import rojos.leaguedata.adapters.ExpandableListAdapter;
import rojos.leaguedata.presenters.LeagueContract;
import rojos.leaguedata.R;
import rojos.leaguedata.retrofit.ServerURL;
import rojos.leaguedata.data.LolStatus.LOLStatusDto;
import rojos.leaguedata.datamodels.ChampionDataModel;

/**
 * Created by Rodrigo on 5/28/2017.
 */

@Deprecated
//Use HomeFragment
public class OldHomeFrag extends Fragment implements LeagueContract.View {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private ChampionListAdapter adapter;
    ExpandableListAdapter expandableListAdapter;
    private ChampionPresenterImplementation championPresenter;
    private ExpandableListView expandableListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    String TAG = "HOME_FRAG";
    private CharSequence servers[] = new CharSequence[]{"Brazil", "Europe Nordic & East", "Europe West",
            "Latin America North", "Latin America South", "North America", "Oceania", "Russia",
            "Turkey", "Japan", "Republic of Korea", "PBE"};

    public static OldHomeFrag newInstance() {
        return new OldHomeFrag();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home_fragment,container,false);
        expandableListView = (ExpandableListView) v.findViewById(R.id.expandableListView);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.championListRecyclerView);
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mLinearLayoutManager.setStackFromEnd(false);
        Bundle bundle = getArguments();
        if(bundle == null) {
            showServerSelection(false);
        }
        return v;
    }

    @Override
    public void showFreeToPlayChampions(ArrayList<ChampionDataModel> championDataModelArrayList) {
        adapter = new ChampionListAdapter(getContext(), championDataModelArrayList);
        adapter.setOnItemClickListener(new ChampionListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, long championID) {
                if(championID != 0) {
                    Intent intent = new Intent(getActivity(), ChampionActivity.class);
                    intent.putExtra("champion_id", championID);
                    startActivity(intent);
                }
//                championPresenter.loadChampionClicked(championID);
            }
        });
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(adapter);
    }


    @Override
    public void showServerStatus(LOLStatusDto lolStatusDto) {
        prepareExpandableListData(lolStatusDto);
        expandableListAdapter = new ExpandableListAdapter(getContext(), listDataHeader, listDataChild);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setVisibility(View.VISIBLE);
        expandableListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                if(ExpandableListView.getPackedPositionType(id) == ExpandableListView.PACKED_POSITION_TYPE_GROUP) {
                    showServerSelection(true);
                    return true;
                }
                return false;
            }
        });
    }

    @Override
    public void showInactiveChampions(List<ChampionDataModel> championDataModels) {

    }

    private void showServerSelection(boolean isChangeServer) {
        AlertDialog.Builder serverSelection = new AlertDialog.Builder(getContext());
        serverSelection.setTitle("Choose a Server");
        serverSelection.setItems(servers, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch(which) {
                    case 0:
                        ServerURL.baseUrl = ServerURL.BR1;
                        break;
                    case 1:
                        ServerURL.baseUrl = ServerURL.EUN1;
                        break;
                    case 2:
                        ServerURL.baseUrl = ServerURL.EUW1;
                        break;
                    case 3:
                        ServerURL.baseUrl = ServerURL.LA1;
                        break;
                    case 4:
                        ServerURL.baseUrl = ServerURL.LA2;
                        break;
                    case 5:
                        ServerURL.baseUrl = ServerURL.NA1;
                        break;
                    case 6:
                        ServerURL.baseUrl = ServerURL.OC1;
                        break;
                    case 7:
                        ServerURL.baseUrl = ServerURL.RU;
                        break;
                    case 8:
                        ServerURL.baseUrl = ServerURL.TR1;
                        break;
                    case 9:
                        ServerURL.baseUrl = ServerURL.JP1;
                        break;
                    case 10:
                        ServerURL.baseUrl = ServerURL.KR;
                        break;
                    case 11:
                        ServerURL.baseUrl = ServerURL.PBE1;
                        break;
                    default:
                        ServerURL.baseUrl = ServerURL.NA1;
                        break;
                }
                loadData(ServerURL.baseUrl);
            }
        });
        serverSelection.setCancelable(false);
        if(ServerURL.baseUrl.isEmpty() || isChangeServer) {
            serverSelection.show();
        } else {
            loadData(ServerURL.baseUrl);
        }
    }

    private void loadData(String url){
        championPresenter = new ChampionPresenterImplementation(this);
        championPresenter.loadServerStatus(url);
        championPresenter.loadChampions(url);
    }

    private void prepareExpandableListData(LOLStatusDto lolStatusDto) {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        String serverStatus = "";
        List<String> statuses = new ArrayList<String>();
        for(int i = 0; i < lolStatusDto.getServices().size(); i++) {
            if(lolStatusDto.getServices().get(i).getName().equalsIgnoreCase("game")) {
                serverStatus = lolStatusDto.getServices().get(i).getStatus();
            } else {
                statuses.add(lolStatusDto.getServices().get(i).getName() + ": " + lolStatusDto.getServices().get(i).getStatus());
            }
        }
        listDataHeader.add(lolStatusDto.getName() + ": " + serverStatus);
        listDataChild.put(listDataHeader.get(0), statuses);
//        adapter.setOnItemClickListener(new ChampionListAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position, String championID) {
//
//            }
//        });
    }


}
