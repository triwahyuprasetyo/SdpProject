package com.why.sdpproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editA, editB, editHasil;
    private Button buttonTambah, buttonClear, buttonExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */

        editA = (EditText) findViewById(R.id.idNilaiA);
        editB = (EditText) findViewById(R.id.idNilaiB);
        editHasil = (EditText) findViewById(R.id.idHasil);
        buttonTambah = (Button) findViewById(R.id.buttonTambah);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonExit = (Button) findViewById(R.id.buttonExit);

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=Double.parseDouble(editA.getText().toString());
                double b=Double.parseDouble(editB.getText().toString());
                double hasil = Double.parseDouble(editA.getText().toString()) + Double.parseDouble(editB.getText().toString());

                editHasil.setText(hasil + "");
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editA.setText("");

                editB.setText("");
                editHasil.setText("");
            }
        });
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Toast.makeText(getApplicationContext(), "The onCreate() event",Toast.LENGTH_SHORT);
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

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "The onStart() event",Toast.LENGTH_SHORT);
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),  "The onResume() event",Toast.LENGTH_SHORT);
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),  "The onPause() event",Toast.LENGTH_SHORT);
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),  "The onStop() event",Toast.LENGTH_SHORT);
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),  "The onDestroy() event",Toast.LENGTH_SHORT);
    }
}
