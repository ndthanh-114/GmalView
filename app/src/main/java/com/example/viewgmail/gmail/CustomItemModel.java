package com.example.viewgmail.gmail;

import com.example.viewgmail.R;

public class CustomItemModel {
    private String txtAvatar;
    private String user;
    private String msg;
    private String hour;
    private boolean isClick;
    public static Integer[] items={
            R.drawable.star,R.drawable.star_fill
    };
    public CustomItemModel(String txtAvatar, String user, String msg, String hour) {
        this.txtAvatar = txtAvatar;
        this.user = user;
        this.msg = msg;
        this.hour = hour;
        this.isClick=false;
    }

    public String getTxtAvatar() {
        return txtAvatar;
    }

    public void setTxtAvatar(String txtAvatar) {
        this.txtAvatar = txtAvatar;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int isClick() {
        if(isClick)
            return 1;
        else return 0;
    }

    public void setClick(boolean click) {
        isClick = click;
    }


}
