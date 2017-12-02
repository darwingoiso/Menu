package com.example.android.ejemplomenus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu m) {
        getMenuInflater().inflate(R.menu.menuselect,m);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.v1:
                Intent intento1=new Intent(this,MainActivity.class);
                startActivity(intento1);
                return true;
            case R.id.v2:
                Intent intento2=new Intent(this,Main2Activity.class);
                startActivity(intento2);
                return true;
            case R.id.v3:
                Intent inte3=new Intent(this,Main3Activity.class);
                startActivity(inte3);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
