package com.learning.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by emre on 01.10.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }
}

