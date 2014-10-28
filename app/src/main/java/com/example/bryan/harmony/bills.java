package com.example.bryan.harmony;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class bills extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bills);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bills, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_bills, container, false);
            Spinner spinner = (Spinner) rootView.findViewById(R.id.customspinnerBills);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),R.array.Menu_Array,R.layout.spinner);
            spinner.setAdapter(adapter);
            spinner.setSelection(adapter.getPosition("Bills"));
            spinner.setOnItemSelectedListener(new MenuListener(getActivity(),adapter.getPosition("Bills")));
//                    new AdapterView.OnItemSelectedListener() {
//                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                    Intent myIntent = null;
//
//                    switch (position) {
//                        case 1:
//                            myIntent = new Intent(getActivity(), main.class);
//                            break;
//                        case 2:
//                            myIntent = new Intent(getActivity(),bills.class);
//                            break;
//                        case 3:
//                            myIntent = new Intent(getActivity(),IOU.class);
//                            break;
//                        case 4:
//                            myIntent = new Intent(getActivity(),Shopping.class);
//                            break;
//                        case 5:
//                            myIntent = new Intent(getActivity(),Events.class);
//                            break;
//                    }
//                    if(myIntent != null)
//                        startActivity(myIntent);
//                }
//                public void onNothingSelected(AdapterView<?> parent) {
//
//                }
//            });

            return rootView;
        }
    }
}
