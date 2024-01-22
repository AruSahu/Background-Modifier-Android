package com.example.backgroundcolorchange;

import androidx.appcompat.app.AppCompatActivity;

//import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button testButton;
    private RelativeLayout MainActivity;

    int turn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity = findViewById(R.id.BackGround);
        testButton = findViewById(R.id.testButton);

        turn = 0;

//        MainActivity.setBackgroundColor(getResources().getColor(R.color.black));

        setOnClickListener();
    }

    private void setOnClickListener() {
        testButton.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                switch (turn) {
                    case 0:
                        MainActivity.setBackgroundColor(getResources().getColor(R.color.teal_200));
                        turn = turn + 1;
                        break;

                    case 1:
                        MainActivity.setBackgroundColor(getResources().getColor(R.color.red));
                        turn = turn + 1;
                        break;

                    case 2:
                        MainActivity.setBackgroundColor(getResources().getColor(R.color.white));
                        turn = 0;
                        break;
                }
            }
        });
    }
}