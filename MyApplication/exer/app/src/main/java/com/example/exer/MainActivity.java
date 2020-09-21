package com.example.exer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button ver_Activity_button, pier_Activity_button, hor_Activity_button, pier2_Activity_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ver_Activity_button = (Button)findViewById(R.id.vertical_button);
        hor_Activity_button = (Button)findViewById(R.id.horizontal_button);
        pier_Activity_button = (Button)findViewById(R.id.pier_button);
        pier2_Activity_button = (Button)findViewById(R.id.pier2_button);

        ver_Activity_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, Vertical.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        hor_Activity_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, Horizontal.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        pier_Activity_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, Pier.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        pier2_Activity_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, Pier2.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

    }
}
