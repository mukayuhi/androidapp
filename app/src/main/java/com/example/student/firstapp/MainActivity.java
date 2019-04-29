package com.example.student.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       int id = item.getItemId();

       if(id==R.id.chairs_id){
           Toast.makeText(getApplicationContext(),"chairs is selected",Toast.LENGTH_SHORT).show();
       }else if (id==R.id.tables_id){
           Toast.makeText(getApplicationContext(),"tables is selected",Toast.LENGTH_SHORT).show();
       }else if (id==R.id.cupboard_id){
           Toast.makeText(getApplicationContext(),"cupboard is selected",Toast.LENGTH_SHORT).show();

       }
       return super.onOptionsItemSelected(item);

    }
}
