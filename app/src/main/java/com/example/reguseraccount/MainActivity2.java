package com.example.reguseraccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    private EditText name_MultiLine;
    private EditText nickname_Multiline;
    private EditText ID_Multiline;
    private EditText new_password;
    private EditText new_password_re;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name_MultiLine = findViewById(R.id.name_MultiLine);
        nickname_Multiline = findViewById(R.id.nickname_Multiline);
        ID_Multiline = findViewById(R.id.ID_Multiline);
        new_password = findViewById(R.id.new_password);
        new_password_re = findViewById(R.id.new_password_re);

        Button button = findViewById(R.id.return_button);
        Button button1 = findViewById(R.id.reg_button);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(),MainActivity.class);
            startActivity(intent);
        });
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(),MainActivity3.class);
            startActivity(intent);
        });
    }
}