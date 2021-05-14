package com.example.taxi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SetPathActivity extends AppCompatActivity
{
    Button button_save_address;
    EditText edit_from_street;
    EditText edit_from_house;
    EditText edit_to_street;
    EditText edit_to_house;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_path);

        button_save_address = findViewById(R.id.button_save_address);
        edit_from_street = findViewById(R.id.edit_from_street);
        edit_from_house = findViewById(R.id.edit_from_house);
        edit_to_street = findViewById(R.id.edit_to_street);
        edit_to_house = findViewById(R.id.edit_to_house);
    }
}
