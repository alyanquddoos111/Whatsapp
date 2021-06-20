package com.alyan.whatsapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class StatusFragment extends Fragment {
    RecyclerView recyclerView;
    StatusAdapter statusAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Status> contactList_Status = new ArrayList<>();

    public StatusFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.statusfragment, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewStatus);
        contactList_Status.add(new Status("Yoji", R.drawable.yuji, "12:00 AM"));
        contactList_Status.add(new Status("Eren Yeager", R.drawable.aot, "12:00 AM"));
        contactList_Status.add(new Status("Gojo Satoro", R.drawable.gojo, "12:00 AM"));
        contactList_Status.add(new Status("Sasuke Uchicha", R.drawable.sasuke, "12:00 AM"));
        contactList_Status.add(new Status("Kakashi Hatake", R.drawable.kakashi, "12:00 AM"));
        contactList_Status.add(new Status("Itachi Uchicha", R.drawable.itachi, "12:00 AM"));
        contactList_Status.add(new Status("Mitsutki", R.drawable.slayer, "12:00 AM"));
        contactList_Status.add(new Status("Naruto Uzumaki", R.drawable.naruto, "12:00 AM"));
        contactList_Status.add(new Status("Buroto Uzumaki", R.drawable.buroto, "12:00 AM"));
        contactList_Status.add(new Status("Ken Kakashi", R.drawable.ken, "12:00 AM"));

        statusAdapter = new StatusAdapter(getContext(), contactList_Status);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(statusAdapter);

        return view;
    }
}
