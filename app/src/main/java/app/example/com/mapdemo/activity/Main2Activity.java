package app.example.com.mapdemo.activity;

import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import app.example.com.mapdemo.R;
import app.example.com.mapdemo.model.Model;

public class Main2Activity extends AppCompatActivity {

//    RecyclerView recyclerview;
//    ArrayList<Model> list;
       Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_layout);

        init();
    }

    private void init() {
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        recyclerview=(RecyclerView)findViewById(R.id.recyclerview);
//        recyclerview.setLayoutManager(new LinearLayoutManager(Main2Activity.this));
//        recyclerview.setHasFixedSize(true);
//        list=new ArrayList<>();
//        list.add(new Model());
//        list.add(new Model());
//        list.add(new Model());
//        list.add(new Model());
//        list.add(new Model());
//        re


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        MenuItem item=menu.findItem(R.id.action_search);
       ActionProvider searchView= MenuItemCompat.getActionProvider(item);
        return super.onCreateOptionsMenu(menu);
    }
}
