package com.example.jaykishan.niki;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

/**
 * Created by jaykishan on 28/10/17.
 */

public class ContactsAdapter extends CursorAdapter {
    public ContactsAdapter(Context context, Cursor c) {
        super(context, c);
    }

    public ContactsAdapter(Context context, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
    }

    public ContactsAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {

        View view = LayoutInflater.from(context).inflate(R.layout.contacts_list_item, viewGroup, false);
        ContactsViewHolder viewHolder = new ContactsViewHolder(view);
        view.setTag(viewHolder);

        return view;

    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        ContactsViewHolder viewHolder = (ContactsViewHolder) view.getTag();

        Uri imageUri=null;
//
//        String image = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.PHOTO_URI));
//
//        if(image==null)
//            imageUri = Uri.parse(image);

        viewHolder.profileName.setText(cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)));

//        viewHolder.profileImage.setImageURI(imageUri);
    }
}
