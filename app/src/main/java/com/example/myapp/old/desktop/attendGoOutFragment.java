package com.example.myapp.old.desktop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.myapp.old.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link attendGoOutFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class attendGoOutFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public attendGoOutFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static attendGoOutFragment newInstance(String param1, String param2) {
        attendGoOutFragment fragment = new attendGoOutFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_attend_go_out, container, false);
        Button attendgoout_attend_btn = view.findViewById(R.id.attend_goout_startout_btn);
        attendgoout_attend_btn.setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(attendGoOutFragmentDirections.actionAttendGoOutFragmentToFavorFragment());
        });
        return view;
    }
}