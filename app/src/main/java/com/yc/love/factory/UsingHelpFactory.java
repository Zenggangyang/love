package com.yc.love.factory;

import android.support.v4.app.Fragment;

import com.yc.love.ui.frament.UsingHelpT1Fragment;
import com.yc.love.ui.frament.UsingHelpT2Fragment;
import com.yc.love.ui.frament.UsingHelpT3Fragment;
import com.yc.love.ui.frament.UsingHelpT4Fragment;
import com.yc.love.ui.frament.UsingHelpT5Fragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mayn on 2019/5/5.
 */

public class UsingHelpFactory {

    public static final int FRAGMENT_0 = 0;
    public static final int FRAGMENT_1 = 1;
    public static final int FRAGMENT_2 = 2;
    public static final int FRAGMENT_3 = 3;
    public static final int FRAGMENT_4 = 4;
    public static Map<Integer, Fragment> fragments = new HashMap<>();

    public static Fragment createFragment(int position) {
        Fragment fragment = fragments.get(position);
        if (fragment != null) {
            return fragment;
        }
        switch (position) {
            case FRAGMENT_0:
                fragment = new UsingHelpT1Fragment();
                fragments.put(FRAGMENT_0, fragment);
                break;
            case FRAGMENT_1:
                fragment = new UsingHelpT2Fragment();
                fragments.put(FRAGMENT_1, fragment);
                break;
            case FRAGMENT_2:
                fragment = new UsingHelpT3Fragment();
                fragments.put(FRAGMENT_2, fragment);
                break;
            case FRAGMENT_3:
                fragment = new UsingHelpT4Fragment();
                fragments.put(FRAGMENT_3, fragment);
                break;
            case FRAGMENT_4:
                fragment = new UsingHelpT5Fragment();
                fragments.put(FRAGMENT_4, fragment);
                break;
        }
        return fragment;
    }
}
