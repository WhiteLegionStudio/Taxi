package com.example.taxi;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CallTaxiActivity extends AppCompatActivity
{
    Button button_set_path;
    Button button_call_taxi;
    TextView text_user_name;
    TextView text_user_phone;
    TextView text_status;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_taxi);

        button_set_path = findViewById(R.id.button_set_path);
        button_call_taxi = findViewById(R.id.button_call_taxi);
        text_user_name = findViewById(R.id.text_user_name);
        text_user_phone = findViewById(R.id.text_user_phone);
        text_status = findViewById(R.id.text_status);
    }
}
