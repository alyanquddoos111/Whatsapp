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

import java.util.ArrayList;
import java.util.List;

public class CallFragment extends Fragment {

    RecyclerView recyclerView_calls;
    CallAdapter callAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Calls> contactList_calls = new ArrayList<>();

    public CallFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chatsfragment, container, false);
        recyclerView_calls = view.findViewById(R.id.recyclerViewChat);
        contactList_calls.add(new Calls("Yuji", R.drawable.yuji, "Month Ago", R.drawable.ic_baseline_call_24));
        contactList_calls.add(new Calls("Eren Yeager", R.drawable.aot, "Yesterday", R.drawable.ic_baseline_call_24));
        contactList_calls.add(new Calls("Gojo Saturo", R.drawable.gojo, "Today 12:00pm", R.drawable.ic_baseline_call_24));
        contactList_calls.add(new Calls("Sasuke Uchicha", R.drawable.sasuke, "Yesterday 5:08pm", R.drawable.ic_baseline_call_24));
        contactList_calls.add(new Calls("Kakashi Hatake", R.drawable.kakashi, "Monday 3:15am", R.drawable.ic_baseline_call_24));
        contactList_calls.add(new Calls("Itachi Uchicha", R.drawable.itachi, "Today 01:09 pm", R.drawable.ic_baseline_call_24));
        contactList_calls.add(new Calls("Mistsuki", R.drawable.slayer, "Yesterday 13:11pm", R.drawable.ic_baseline_call_24));
        contactList_calls.add(new Calls("Naruto Uzumaki", R.drawable.naruto, "Today 8:32pm", R.drawable.ic_baseline_call_24));
        contactList_calls.add(new Calls("Boruto Uzumaki", R.drawable.buroto, "Today 9:43pm", R.drawable.ic_baseline_call_24));
        contactList_calls.add(new Calls("Ken Kakashi", R.drawable.ken, "Just Now", R.drawable.ic_baseline_call_24));


        callAdapter = new CallAdapter(getContext(), contactList_calls);
        recyclerView_calls.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView_calls.setLayoutManager(layoutManager);
        recyclerView_calls.setAdapter(callAdapter);


        return view;
    }
}