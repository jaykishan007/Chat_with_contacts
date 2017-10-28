package com.example.jaykishan.niki;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jaykishan on 28/10/17.
 */

public class ContactsViewHolder {

    public final ImageView profileImage;
    public final TextView profileName;


    public ContactsViewHolder(View view) {
        profileImage = (ImageView) view.findViewById(R.id.profile_image);
        profileName = (TextView) view.findViewById(R.id.profile_name);
    }
}
