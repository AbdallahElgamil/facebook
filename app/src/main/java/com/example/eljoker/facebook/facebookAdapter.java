package com.example.eljoker.facebook;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by el joker on 21/02/2018.
 */

public class facebookAdapter extends ArrayAdapter<facebook> {


    public facebookAdapter(Activity context, ArrayList<facebook> facebook) {

        super(context, 0, facebook);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        facebook currentfacebook = getItem(position);

        TextView postContentView = (TextView) listItemView.findViewById(R.id.postContent);
        postContentView.setText(currentfacebook.getPost_content());

        TextView userNameView = (TextView) listItemView.findViewById(R.id.userName);
        userNameView.setText(currentfacebook.getUser_name());

        ImageView profilePicture = (ImageView) listItemView.findViewById(R.id.profilePicture);
        profilePicture.setImageResource(currentfacebook.getProfileImage());

        ImageView postPicture = (ImageView) listItemView.findViewById(R.id.postPicture);
        postPicture.setImageResource(currentfacebook.getPostImage());

        return listItemView;
    }

}
