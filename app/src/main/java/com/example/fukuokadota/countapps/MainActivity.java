package com.example.fukuokadota.countapps;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    final int OPE_PLUS = 1;
    final int OPE_MINUS = 2;
    final int OPE_MULTI = 3;

    int ope;
    int count;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.textView);
        count = 0;
    }

    public void plus(View v){
        ope = OPE_PLUS;
    }

    public void minus(View v){
        ope = OPE_MINUS;
    }

    public void multi(View v){
        ope = OPE_MULTI;
    }

    public void execute(View v){
        switch (ope){
            case OPE_PLUS:
                count++;
                break;
            case OPE_MINUS:
                count--;
                break;
            case OPE_MULTI:
                count *= 2;
                break;
        }

        tv.setText("" + count);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
