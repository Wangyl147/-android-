package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        final TextView textview = findViewById(R.id.textview);
        final EditText edittext = findViewById(R.id.edittext);
        final CheckBox checkbox = findViewById(R.id.checkbox);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final String name = edittext.getText().toString();
                textview.setText("What a wonderful world,"+name+"!");
                if(checkbox.isChecked())
                    textview.setTextColor(Color.RED);
                else
                    textview.setTextColor(Color.BLACK);
            }
        });
    }
}
