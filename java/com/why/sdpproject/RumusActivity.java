package com.why.sdpproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RumusActivity extends AppCompatActivity {

    private EditText eA, eB, eH;
    private Button bt, bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus);
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

        eA = (EditText) findViewById(R.id.editTA);
        eB = (EditText) findViewById(R.id.editTB);
        eH = (EditText) findViewById(R.id.editTHasil);
        bt = (Button) findViewById(R.id.buttonT);
        bd = (Button) findViewById(R.id.buttonDiskon);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(eA.getText().toString());
                double b = Double.parseDouble(eB.getText().toString());
                Rumus r = new Rumus();
                double c = r.tambah(a, b);
                eH.setText(c + "");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rumus r = new Rumus();
                r.setDiskon(Double.parseDouble(eB.getText().toString()));
                r.setPotongan(1000);
                double total = r.didiskon(Double.parseDouble(eA.getText().toString()));
                eH.setText(total + "");
            }
        });
    }

}
