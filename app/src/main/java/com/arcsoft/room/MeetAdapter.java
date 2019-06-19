package com.arcsoft.room;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MeetAdapter extends ArrayAdapter {
    private int newResourceId;
    public MeetAdapter(Context context, int resourceId, List<Meet> meetList) {
        super(context, resourceId, meetList);
        newResourceId = resourceId;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){

        Meet meet = (Meet) getItem (position);
        View view = LayoutInflater.from (getContext ()).inflate (newResourceId, parent, false);

        TextView meetHead= view.findViewById (R.id.head);
        TextView meetContent = view.findViewById (R.id.content);

        meetHead.setText (meet.getMeetTime ()+" ");
        meetContent.setText (meet.getMeetName ());
        return view;
    }

}
