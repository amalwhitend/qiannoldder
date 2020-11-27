package com.example.myapp.old.general;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.fragment.app.Fragment;

import com.example.myapp.old.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link favorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class favorFragment extends Fragment implements CompoundButton.OnCheckedChangeListener {
    Button lastBtn;
    Button endBtn;
    ArrayList<String> favor=new ArrayList<String>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public favorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment favorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static favorFragment newInstance(String param1, String param2) {
        favorFragment fragment = new favorFragment();
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
        View view=inflater.inflate(R.layout.fragment_favor, container, false);
        CheckBox wtfb = (CheckBox) view.findViewById(R.id.favor_wtf);
        CheckBox walkb = (CheckBox) view.findViewById(R.id.walk);
        CheckBox hikingb = (CheckBox) view.findViewById(R.id.hiking);
        CheckBox vulonteerb = (CheckBox) view.findViewById(R.id.vulonteer);
        CheckBox ballb = (CheckBox) view.findViewById(R.id.ball);
        CheckBox floweringb = (CheckBox) view.findViewById(R.id.flowering);
        CheckBox fishingb = (CheckBox) view.findViewById(R.id.fishing);
        CheckBox chessb = (CheckBox) view.findViewById(R.id.chess);
        CheckBox travelb = (CheckBox) view.findViewById(R.id.travel);
        CheckBox inkb = (CheckBox) view.findViewById(R.id.ink);
        CheckBox paintingb = (CheckBox) view.findViewById(R.id.painting);
        CheckBox dancingb = (CheckBox) view.findViewById(R.id.dance);

        endBtn = (Button) view.findViewById(R.id.laststep);
        lastBtn = (Button) view.findViewById(R.id.nextstep);
        wtfb.setOnCheckedChangeListener(this);
        walkb.setOnCheckedChangeListener(this);
        hikingb.setOnCheckedChangeListener(this);
        vulonteerb.setOnCheckedChangeListener(this);
        ballb.setOnCheckedChangeListener(this);
        floweringb.setOnCheckedChangeListener(this);
        fishingb.setOnCheckedChangeListener(this);
        chessb.setOnCheckedChangeListener(this);
        travelb.setOnCheckedChangeListener(this);
        inkb.setOnCheckedChangeListener(this);
        paintingb.setOnCheckedChangeListener(this);
        dancingb.setOnCheckedChangeListener(this);
        // Inflate the layout for this fragment
        endBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < favor.size(); i++) {
                    if (i == (favor.size() - 1)) {
                        sb.append(favor.get(i));
                    } else {
                        sb.append(favor.get(i) + ",");
                    }
                }
            }
        });
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked){
            favor.add(buttonView.getText().toString().trim());
        }else {
            //从数组中移除
            favor.remove(buttonView.getText().toString().trim());
        }

    }
}