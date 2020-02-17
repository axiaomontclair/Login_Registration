package com.example.login_registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registration extends AppCompatActivity {
    private Button button;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        //connects lastname from registration.xml
        final EditText reglastname = findViewById(R.id.reglastname);

        //connects button from registration .xml file
        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (reglastname.getText().length()==0) {
                   reglastname.setError("Please Enter last name");

                   submit = findViewById(R.id.regsubmit);
                   submit.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           openactivity_main();
                       }
                   });

               }
            }
        });
    }
//connects the submit button back to the main page
    private void openactivity_main() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
