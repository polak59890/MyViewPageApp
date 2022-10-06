package fr.elosi.android.myviewpageapp.Controllers.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import fr.elosi.android.myviewpageapp.Controllers.Fragments.NewsPageFragment;
import fr.elosi.android.myviewpageapp.Controllers.Fragments.PageFragment;
import fr.elosi.android.myviewpageapp.Controllers.Fragments.ParamPageFragment;
import fr.elosi.android.myviewpageapp.Controllers.Fragments.ProfilePageFragment;

public class PageAdapter extends FragmentPagerAdapter {


    // 1 - Array of colors that will be passed to PageFragment


    // 2 - Default Constructor
    public PageAdapter(FragmentManager mgr) {
        super(mgr);
    }

    @Override
    public int getCount() {
        return(3); //  - Number of page to show
    }

    @NonNull
    @Override
    public Fragment getItem(int position) { switch (position){
        case 0: //Page number 1
            return NewsPageFragment.newInstance();
        case 1: //Page number 2
            return ProfilePageFragment.newInstance();
        case 2: //Page number 3
            return ParamPageFragment.newInstance();
        default:
            return null;
    }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: //Page number 1
                return "Fil d'actualité";
            case 1: //Page number 2
                return "Profil";
            case 2: //Page number 3
                return "Paramètre";
            default:
                return null;
        }
    }
}
