package com.example.viewgmail.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.viewgmail.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    List<CustomItemModel> list;
    String [] names = {"Eduria.com","Chris Abad","Tuto.com","support","Matt from Ionic","Udemy Instructor",
            "GitHub","Google","Entopy","Dabia"};
    String [] titles = {"$19 Only(First 10 spots) - Bestselling...","Help make Campaign Monitor better",
            "8h de formation gratuite et les nouvea...","Societe Ovh: suivi de vos services - hp...","New " +
            "Ionic Creator Is Here!","Early Bird Discount on new ML course: 48 hours left!",
            "Discover what’s new at GitHub","Security Alert!","Idk Man These titles are hard","Rlly Running outta ideas here"};
    String [] times = {"0:00 pm","6:13 am","12:30 pm", "9:52 am", "6:10 am","4:50 pm","12:00 pm","7:00 pm","9:20 am","3:10 pm"};
    String [] contents = {"Are you looking to Learn Web Designin...","Let us know your thoughts! No Images...",
            "Photoshop, SEO, Blender, CSS, WordPre...","SAS OVH - http://www.ovh 2 rue K...","Announcing the all-new Creator, build...",
            "There is only 4...","We’re constantly learning, buil...","academia.edu has been granted access...","Smth Smth smth smth",
            "bla bla bla bla bleh"};

    String [] avatar = {"0","1","2","3","4","5","6","7","8","9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=new ArrayList<>();
        for(int i=0;i<times.length;i++){
            list.add(new CustomItemModel(avatar[i],names[i], contents[i], times[i]));
        }

        CustomAdapter adapter=new CustomAdapter(list, this);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CustomItemModel x = list.get(position);

//                x.setTxtAvatar();view= LayoutInflater.from(this).inflate(R.layout.click_selected,parent,false);
//                TextView txtCheck=view.findViewById(R.id.imgCheck);
//                TextView msgClick=view.findViewById(R.id.msgClick);
//                TextView close=view.findViewById(R.id.X);


            }
        });

    }


}