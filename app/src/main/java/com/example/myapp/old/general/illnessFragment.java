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
 * Use the {@link illnessFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class illnessFragment extends Fragment implements CompoundButton.OnCheckedChangeListener {

    ArrayList<String> ill=new ArrayList<String>();

    Button lastBtn;
    Button endBtn;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public illnessFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment illnessFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static illnessFragment newInstance(String param1, String param2) {
        illnessFragment fragment = new illnessFragment();
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
        View view = inflater.inflate(R.layout.fragment_illness, container, false);
        CheckBox depressb;
        CheckBox sugarillb;
        CheckBox recognizeb;
        CheckBox highpressb;
        CheckBox headheartb;
        CheckBox midwindb;
        CheckBox chronicb;
        CheckBox pakinshenb;
        CheckBox decayb;
        CheckBox bonelostb;
        CheckBox lowtempb;
        CheckBox menularb;
        CheckBox flub;
        CheckBox assb;

        depressb = (CheckBox) view.findViewById(R.id.depress);
        sugarillb = (CheckBox) view.findViewById(R.id.sugarill);
        recognizeb = (CheckBox) view.findViewById(R.id.recognize);
        highpressb = (CheckBox) view.findViewById(R.id.highpress);
        headheartb = (CheckBox) view.findViewById(R.id.headheart);
        midwindb = (CheckBox) view.findViewById(R.id.midwind);
        chronicb = (CheckBox) view.findViewById(R.id.chronic);
        pakinshenb = (CheckBox) view.findViewById(R.id.pakinshen);
        decayb = (CheckBox) view.findViewById(R.id.decay);
        bonelostb = (CheckBox) view.findViewById(R.id.bonelost);
        lowtempb = (CheckBox) view.findViewById(R.id.lowtemp);
        menularb = (CheckBox) view.findViewById(R.id.menular);
        flub = (CheckBox) view.findViewById(R.id.flu);
        assb = (CheckBox) view.findViewById(R.id.ass);

        endBtn = (Button) view.findViewById(R.id.finish);
        lastBtn = (Button) view.findViewById(R.id.laststep);

        depressb.setOnCheckedChangeListener(this);
        sugarillb.setOnCheckedChangeListener(this);
        recognizeb.setOnCheckedChangeListener(this);
        highpressb.setOnCheckedChangeListener(this);
        headheartb.setOnCheckedChangeListener(this);
        midwindb.setOnCheckedChangeListener(this);
        chronicb.setOnCheckedChangeListener(this);
        pakinshenb.setOnCheckedChangeListener(this);
        decayb.setOnCheckedChangeListener(this);
        bonelostb.setOnCheckedChangeListener(this);
        lowtempb.setOnCheckedChangeListener(this);
        menularb.setOnCheckedChangeListener(this);
        flub.setOnCheckedChangeListener(this);
        assb.setOnCheckedChangeListener(this);

        endBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < ill.size(); i++) {
                    if (i == (ill.size() - 1)) {
                        sb.append(ill.get(i));
                    } else {
                        sb.append(ill.get(i) + ",");
                    }
                }
            }
        });

        return view;
    }
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked){
            ill.add(buttonView.getText().toString().trim());
        }else {
            //从数组中移除
            ill.remove(buttonView.getText().toString().trim());
        }
    }

}