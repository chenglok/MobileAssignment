package com.example.mobileassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    TextView registerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registerLink=findViewById(R.id.registerLink);
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openRegister();
            }

            public void openRegister(){
                Intent intent=new Intent(Login.this,Register.class);
                startActivity(intent);
            }
        });
    }
}