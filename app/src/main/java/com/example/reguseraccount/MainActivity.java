package com.example.reguseraccount;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText editTextTextEmailAddress;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);

        editTextPassword = findViewById(R.id.editTextPassword);

        Button button = findViewById(R.id.button_login);
        Button button1 = findViewById(R.id.button_accountCreate);
    }
}