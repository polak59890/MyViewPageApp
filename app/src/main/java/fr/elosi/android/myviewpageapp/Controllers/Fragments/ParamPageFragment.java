package fr.elosi.android.myviewpageapp.Controllers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.elosi.android.myviewpageapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ParamPageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParamPageFragment extends Fragment {


    public ParamPageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ParamPageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ParamPageFragment newInstance() {
        return new ParamPageFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_param_page, container, false);
    }
}