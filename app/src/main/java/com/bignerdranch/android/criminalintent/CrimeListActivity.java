package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by bretfears on 10/3/16.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
