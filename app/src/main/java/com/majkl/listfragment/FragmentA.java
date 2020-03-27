package com.majkl.listfragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;


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
        adapter = new ArrayAdapter<String>(getActivity(), R.layout.support_simple_spinner_dropdown_item,mockData);
        lv.setAdapter(adapter);
        return view;



}
