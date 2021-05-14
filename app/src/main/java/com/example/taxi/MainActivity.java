package com.example.taxi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    boolean isRegisterMode = true;

    Button button_register;
    EditText edit_phone_number;
    EditText edit_first_name;
    EditText edit_last_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_register = findViewById(R.id.button_register_enter);
        edit_phone_number = findViewById(R.id.edit_phone_number);
        edit_first_name = findViewById(R.id.edit_first_name);
        edit_last_name = findViewById(R.id.edit_last_name);

        isRegisterMode = true;
        if (!isRegisterMode)
        {
            button_register.setText(R.string.button_enter);
        }

        button_register.setOnClickListener(view ->
        {

        });
    }
}