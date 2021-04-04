package com.navya.sharedprefsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        SharedPreferences sP = getSharedPreferences("MyPrefs" , 0);
        String editVal = sP.getString("name" , "No value till now");
        textView.setText(editVal);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = editText.getText().toString();
               // SharedPreferences sP = getSharedPreferences("MyPrefs" , 0);
                SharedPreferences.Editor ed = sP.edit();
                ed.putString("name",val);
                ed.apply();
                textView.setText(val);
            }
        });


    }
}