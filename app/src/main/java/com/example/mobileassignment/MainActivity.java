package com.example.mobileassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button lbutton;
    private Button pbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lbutton=findViewById(R.id.button2);
        lbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                openLogin();
            }
            public void openLogin(){
                Intent intent = new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        });

        pbutton=findViewById(R.id.button4);
        pbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                openRegister();
            }
            public void openRegister(){
                Intent intent = new Intent(MainActivity.this,Register.class);
                startActivity(intent);
            }
        });
    }
}