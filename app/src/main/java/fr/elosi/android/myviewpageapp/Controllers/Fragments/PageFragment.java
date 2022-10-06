package fr.elosi.android.myviewpageapp.Controllers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import fr.elosi.android.myviewpageapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PageFragment extends Fragment {


    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String KEY_POSITION = "position";
    private static final String KEY_COLOR = "color";


    private String position;
    private String color;

    public PageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param position Parameter 1.
     * @param color Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    public static PageFragment newInstance(int position, int color) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(KEY_POSITION, position);
        args.putInt(KEY_COLOR, color);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getString(KEY_POSITION);
            color = getArguments().getString(KEY_COLOR);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View result = inflater.inflate(R.layout.fragment_page, container, false);
        LinearLayout rootView = (LinearLayout) result.findViewById(R.id.fragment_page_rootview);
        TextView textView = (TextView) result.findViewById(R.id.fragment_page_title);

        assert getArguments() != null;
        int position = getArguments().getInt(KEY_POSITION,-1);
        int color = getArguments().getInt(KEY_COLOR,-1);

        rootView.setBackgroundColor(color);
        textView.setText(getString(R.string.page_number) + position);
         Log.e(getClass().getSimpleName(),"onCreatView called for fragment number " + position);
        return result;
    }
}