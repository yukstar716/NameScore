package com.example.yuki19920716.namescore;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MyForm extends ActionBarActivity {

    public final static String EXTRA_MYNAME = "com.example.yuki19920716.namescore.MYNAME";

    // Hello Ryo!!!
    // Hello Yuki!!! YYYeaaaahhhhhhhhhhhhhhhhhhhhhh!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    ////Uhahahaha

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);
    }

    public void getScore(View v) {
        EditText myEditText = (EditText) findViewById(R.id.myEditText);
        String myName = myEditText.getText().toString().trim();
        if (myName.equals("")){
            //myEditText.setError("Please Enter Your Name!");
            //Toast.makeText(this, "Please Enter Your Name!", Toast.LENGTH_LONG).show();
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

            alertDialogBuilder
                    .setTitle("Error!")
                    .setMessage("Please Enter Your Name!")
                    .setPositiveButton("OK", null);
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        } else {
            Intent intent = new Intent(this, MyResult.class);
            intent.putExtra(EXTRA_MYNAME, myName);
            startActivity(intent);

            }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_form, menu);
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
