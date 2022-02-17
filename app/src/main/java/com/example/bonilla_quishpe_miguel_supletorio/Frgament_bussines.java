package com.example.bonilla_quishpe_miguel_supletorio;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frgament_bussines#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frgament_bussines extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters


    public Frgament_bussines() {
        // Required empty public constructor
    }

    private List<Tarea> listaTareas = new ArrayList<Tarea>();
    private RecyclerView mRecyclerView;

    // TODO: Rename and change types and number of parameters
    public static Frgament_bussines newInstance(String param1, String param2) {
        Frgament_bussines fragment = new Frgament_bussines();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frgament_bussines, container, false);
    }


}