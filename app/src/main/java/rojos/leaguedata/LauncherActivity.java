package rojos.leaguedata;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import rojos.leaguedata.retrofit.ServerURL;

/**
 * Created by Rodrigo on 6/17/2017.
 */

public class LauncherActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showServerSelection();
    }

    private void showServerSelection() {
        CharSequence servers[] = getResources().getStringArray(R.array.servers);
        AlertDialog.Builder serverSelection = new AlertDialog.Builder(this);
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
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        serverSelection.setCancelable(false);
        serverSelection.show();
    }
}
