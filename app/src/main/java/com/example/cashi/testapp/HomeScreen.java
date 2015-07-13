package com.example.cashi.testapp;

import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.nfc.Tag;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.graphics.drawable.ShapeDrawable.*;


public class HomeScreen extends ActionBarActivity {

    private static final String TAG = "HomeScreen";
    TextView background;
    Button btn1;
    String theColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        theColor = "#00ff00";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        background = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (theColor == "#00ff00") {
                    theColor = "#0000ff";
                    background.setBackgroundColor(Color.parseColor(theColor));
                    background.setText("que?");
                } else {
                    theColor = "#00ff00";
                    background.setBackgroundColor(Color.parseColor(theColor));
                    background.setText("Otro");
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
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

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "TEST");
        Log.d ("whataaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "TEST");
    }

}
