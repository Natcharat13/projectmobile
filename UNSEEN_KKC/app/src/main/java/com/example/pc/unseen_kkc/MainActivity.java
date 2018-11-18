package com.example.pc.unseen_kkc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText usernameET, passwordET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameET = (EditText)findViewById(R.id.etusername);
        passwordET = (EditText)findViewById(R.id.etpass);
    }
    public void onLogin(View view) {

    }
}
