package com.example.login_registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creates connections of buttons
        button1 = findViewById(R.id.login);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhomepage();

                button2 = findViewById(R.id.register);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openregistration();
                    }
                });


            }
        });
    }
//connects the buttons to the other Activities
    public void openregistration() {
        Intent intent = new Intent(this,registration.class);
        startActivity(intent);
    }

    public void openhomepage(){
        Intent intent = new Intent(this,homepage.class);
        startActivity(intent);
    }
}
