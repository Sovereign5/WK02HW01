package com.example.wk02hw01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class nextActivity extends AppCompatActivity {

    TextView welcomeTextViewHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        // Create welcome text view and get username
        welcomeTextViewHere = (TextView) findViewById(R.id.welcomeTextView);
        String username = getIntent().getStringExtra("username");
        String totalWelcomeMessage = "Welcome " + username;

        welcomeTextViewHere.setText(totalWelcomeMessage);
    }
}
