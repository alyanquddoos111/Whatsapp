package com.alyan.whatsapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import static android.widget.LinearLayout.HORIZONTAL;

public class ChatFragment extends Fragment {
    RecyclerView recyclerView;
    ChatsAdapter chatsAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Chats> contactList = new ArrayList<>();

    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chatsfragment, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewChat);
        contactList.add(new Chats("Yoji", R.drawable.yuji, "Sukoon se khana khanay do", "12:00 AM"));
        contactList.add(new Chats("Eren Yeager", R.drawable.aot, "Haan sahi keh rahe", "12:00 AM"));
        contactList.add(new Chats("Gojo Saturo", R.drawable.gojo, "Bara pachtaogay", "12:00 AM"));
        contactList.add(new Chats("Sasuke Uchicha", R.drawable.sasuke, "Mera bhai kaha gya", "12:00 AM"));
        contactList.add(new Chats("Kakashi Hatake", R.drawable.kakashi, "Meri ek naakh nakli ha", "12:00 AM"));
        contactList.add(new Chats("Itachi Uchicha", R.drawable.itachi, "Meri donoo aankhein asli hein", "12:00 AM"));
        contactList.add(new Chats("Mitsutki", R.drawable.slayer, "Ghar beth beth k bore hogya hn", "12:00 AM"));
        contactList.add(new Chats("Naruto Uzumaki", R.drawable.naruto, "Game me aa jaldi", "12:00 AM"));
        contactList.add(new Chats("Boruto Uzumaki", R.drawable.buroto, "Nahi aana game me", "12:00 AM"));
        contactList.add(new Chats("Ken Kakashi", R.drawable.ken, "Mere se bhi baat kro", "12:00 AM"));

        chatsAdapter = new ChatsAdapter(getContext(), contactList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(chatsAdapter);


        return view;
    }
}