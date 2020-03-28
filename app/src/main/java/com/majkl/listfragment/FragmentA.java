package com.majkl.listfragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    ListView lv;

    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] mockData = {"Mile", "Timun", "Slavko", "Zimzo", "Cvinco"};


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_a, container, false);
        lv = view.findViewById(R.id.idListView);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, mockData);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "Clicked " + position, Toast.LENGTH_SHORT).show();
            }
        });
        return view;


    }
}
