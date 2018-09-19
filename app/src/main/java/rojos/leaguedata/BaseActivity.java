package rojos.leaguedata;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Rodrigo on 6/18/2017.
 */

public class BaseActivity extends AppCompatActivity {

    protected void setFragment(int containerViewId, Fragment fragment, String TAG) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        fragmentTransaction.replace(containerViewId,fragment,TAG);
        fragmentTransaction.commit();
    }
}
