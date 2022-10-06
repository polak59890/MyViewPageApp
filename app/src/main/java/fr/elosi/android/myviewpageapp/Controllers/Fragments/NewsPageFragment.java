package fr.elosi.android.myviewpageapp.Controllers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.elosi.android.myviewpageapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewsPageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewsPageFragment extends Fragment {



    public NewsPageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment NewsPageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NewsPageFragment newInstance() {
        return new NewsPageFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_page, container, false);
    }
}