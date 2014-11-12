package com.example.user.lostitemsinquiry;

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

import com.example.user.lostitemsinquiry.R;

public class ItemList extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }
    public static boolean choice =true;

    public void nextScreenInfo(View view) {                                //copy sa mga main
        // Do something in response to button


        if(choice==true) {
            Intent intent = new Intent(this, Response.class);//name of sub pages
            //del
            startActivity(intent);
        }
        else if(choice==false){
            Intent intent = new Intent(this, Response1.class);//name of sub pages

            //del
            startActivity(intent);
        }
    }
    public void calculator(View View){
        choice = true;
    }
    public void book(View View){
        choice = true;
    }
    public void umbrella(View View){
        choice = false;
    }
    public void notebook(View View){
        choice = true;
    }
    public void wallet(View View){
        choice = false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.item_list, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_item_list, container, false);
            return rootView;
        }
    }
}
