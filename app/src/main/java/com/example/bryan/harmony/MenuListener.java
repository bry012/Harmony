package com.example.bryan.harmony;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by bryan on 10/27/14.
 */
public class MenuListener implements AdapterView.OnItemSelectedListener {
    Activity currentActivity;
    int index;
    public MenuListener(Activity currentActivity,int index){

        this.currentActivity = currentActivity;
        this.index = index;

    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Intent myIntent = null;

        switch (position) {
            case 0:
                myIntent = new Intent(this.currentActivity,main.class);
                break;
            case 1:
                myIntent = new Intent(this.currentActivity,bills.class);
                break;
            case 2:
                myIntent = new Intent(this.currentActivity,IOU.class);
                break;
            case 3:
                myIntent = new Intent(this.currentActivity,Shopping.class);
                break;
            case 4:
                myIntent = new Intent(this.currentActivity,Events.class);
                break;
        }
        if(myIntent != null && position != this.index)
           this.currentActivity.startActivity(myIntent);
    }
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
