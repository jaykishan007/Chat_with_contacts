package com.example.jaykishan.niki.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jaykishan.niki.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ChatListFragment extends Fragment {

    public ChatListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chat_list_main, container, false);

    }
}
