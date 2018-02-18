package com.example.datapassing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/*
Example of Passing Data from one activity to another activity on click of a button in 1st activity
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        final EditText editText = findViewById(R.id.et);
        Button button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//
//                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
//                intent.putExtra("Key_NAME", "HI Sanjay"); // Pass"Hi Sanjay" message to second activty
//                startActivity(intent);

                String str = editText.getText().toString(); // Get string in textbox in Main activity
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("Key_NAME", str); // Pass string str to second activity
                startActivity(intent);
            }
        });
    }
}

