package com.example.viewgmail.gmail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.viewgmail.R;

import java.util.List;

public class CustomAdapter extends BaseAdapter  {

    List<CustomItemModel> items;
    Context context;

    public CustomAdapter(List<CustomItemModel> items, Context context) {
        this.items = items;
        this.context = context;
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false);
        }
        TextView image_avatar=view.findViewById(R.id.image_avatar);
        TextView text_user=view.findViewById(R.id.text_username);
        TextView text_msg=view.findViewById(R.id.text_message);
        TextView hour=view.findViewById(R.id.hour);
        ImageView btnStar=view.findViewById(R.id.btnStar);

        CustomItemModel item=(CustomItemModel)this.getItem(i);
        image_avatar.setText(item.getTxtAvatar());
        text_user.setText(item.getUser());
        text_msg.setText(item.getMsg());
        hour.setText(item.getHour());

        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(item.isClick()==1){
                    btnStar.setImageResource(R.drawable.star);
                    item.setClick(false);
                }
                else{
                    btnStar.setImageResource(R.drawable.star_fill);
                    item.setClick(true);
                }
            }
        });

        return view;
    }


}
