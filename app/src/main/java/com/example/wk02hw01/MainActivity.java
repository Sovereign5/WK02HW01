package com.example.wk02hw01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText userPassword;
    TextView errorText;

    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declared UI elements
        userName = (EditText) findViewById(R.id.editTextName);
        userPassword = (EditText) findViewById(R.id.editTextPass);
        login = (Button) findViewById(R.id.button);
        errorText = (TextView) findViewById(R.id.errorView);



        // Login on-click listener
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String attemptUsername = userName.getText().toString();
                String attemptPassword = userPassword.getText().toString();
                Boolean correctUsername = usernameTest(attemptUsername);
                Boolean correctPassword = passwordTest(attemptPassword);

                if (!correctUsername) {
                    userName.requestFocus();
                    errorText.setText(R.string.invalid_username);
                }

                else if (!correctPassword) {
                    userPassword.requestFocus();
                    errorText.setText(R.string.invalid_password);
                }
                else {
                    Intent intent = new Intent(MainActivity.this,nextActivity.class);
                    intent.putExtra("username", attemptUsername);
                    startActivity(intent);
                }
            }

        });
    }


    // Methods:
    // Username Test function
    public Boolean usernameTest(String username) {
        String verifiedUsername = "din_djarin";
        if (verifiedUsername.equals(username)) {
            return true;
        } else {
            System.out.println("returning false");
            return false;
        }
    }

    // Password test function
    public Boolean passwordTest(String password) {
        String verifiedPassword = "baby_yoda_ftw";

        if (verifiedPassword.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

}
