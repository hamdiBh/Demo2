package com.example.hamdi.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button valdiate;
    EditText name;
    EditText mail;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init() {
        valdiate  = (Button) findViewById(R.id.Btn1);
        name = (EditText) findViewById(R.id.name);
        mail = (EditText) findViewById(R.id.mail);
        result = (TextView) findViewById(R.id.result);

        valdiate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _name = name.getText().toString();
                String _mail = mail.getText().toString();
                result.setText("Welcome user :  " + _name + " : " + _mail);
            }
        });
    }
}
