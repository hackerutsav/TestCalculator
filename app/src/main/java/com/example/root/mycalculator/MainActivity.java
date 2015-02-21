package com.example.root.mycalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnButtonClick(View v) {
        //text Field Edit text
        EditText a1 = (EditText)findViewById(R.id.TfNum1);
        EditText a2 = (EditText)findViewById(R.id.TfNum2);

        //1 result label - TextView

        TextView tv = (TextView)findViewById(R.id.Lresult);
        boolean flag = false; //No division by 0
        double num1 , num2 , ans ;
        num1 = Double.parseDouble(a1.getText().toString());
        num2 = Double.parseDouble(a2.getText().toString());
        ans = 0 ;
        if (v.getId() == R.id.Badd)
            ans = num1+num2;
        if (v.getId() == R.id.BSub)
            ans = num1-num2;
        if (v.getId() == R.id.BMultiply)
            ans = num1*num2;
        if (v.getId() == R.id.Bdiv)
            //division by 0
            if (num2 == 0)
                flag = true;  //division by 0 error
            else
                ans = num1/num2;

        tv.setText(ans+"");

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
