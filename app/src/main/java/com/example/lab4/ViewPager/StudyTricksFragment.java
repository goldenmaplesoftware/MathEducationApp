package com.example.lab4.ViewPager;

import android.os.Bundle;

import androidx.appcompat.view.menu.MenuBuilder;
import androidx.collection.ArraySet;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab4.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StudyTricksFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StudyTricksFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1"; ///Title
    private static final String ARG_PARAM2 = "param2"; ///Description
    private static final int ARG_PARAM3=0;

    private String mParam1;
    private String mParam2;
    private int mParam3;


    public StudyTricksFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param3
     * @return A new instance of fragment StudyTricksFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StudyTricksFragment newInstance(String param1, String param2, int param3)
    {

        StudyTricksFragment fragment = new StudyTricksFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putInt(String.valueOf(ARG_PARAM3),param3);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3= getArguments().getInt(String.valueOf(ARG_PARAM3));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_study_tricks, container, false);
        if (mParam1 != null && mParam2!=null)
        {
            TextView title=view.findViewById(R.id.studyTrickTitle);
            title.setText(mParam1);
            TextView description=view.findViewById(R.id.studyTrickDescription); ///This is the description content to be populated
            description.setText(mParam2);
            ImageView image=view.findViewById(R.id.studyTrickImage);
            image.setTag(mParam3);

        }


        return view;
    }

}