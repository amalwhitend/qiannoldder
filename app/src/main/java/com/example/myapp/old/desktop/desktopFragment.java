package com.example.myapp.old.desktop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapp.old.R;
//import com.example.myapp.old.desktopFragmentDirections;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link desktopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class desktopFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public desktopFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment desktopFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static desktopFragment newInstance(String param1, String param2) {
        desktopFragment fragment = new desktopFragment();
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
        View root = inflater.inflate(R.layout.fragment_desktop, container, false);

        root.findViewById(R.id.desktop_notify_iv).setOnClickListener(v->{
            Navigation.findNavController(v).navigate(desktopFragmentDirections.actionDesktopFragmentToNotificationFragment());
        });
        root.findViewById(R.id.desktop_goout_iv).setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(desktopFragmentDirections.actionDesktopFragmentToGoOutFragment());
        });

        root.findViewById(R.id.desktop_phone_iv).setOnClickListener(view -> {
            String number = " ";
            Uri call = Uri.parse("tel:" + number);
            Intent surf = new Intent(Intent.ACTION_DIAL, call);
            startActivity(surf);
        });
        root.findViewById(R.id.desktop_camera_iv).setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            Uri uri = Uri.parse(String.format("tel:000"));
            intent.setData(uri);
            startActivity(intent);
                }
        );

        return root;
    }
}