package com.example.active;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;

public class next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.list,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int a=item.getItemId();
        switch (a){
            case R.id.Location:
                Intent myintent1 =new Intent(next.this,Location.class);
                startActivity(myintent1);
                break;
            case R.id.Search:
                Intent myintent2 =new Intent(next.this,Search.class);
                startActivity(myintent2);
                break;
            case R.id.About:
                Intent myintent3 =new Intent(next.this,About.class);
                startActivity(myintent3);
                break;

            default:
                return false;

        }

        return super.onOptionsItemSelected(item);
    }
}
