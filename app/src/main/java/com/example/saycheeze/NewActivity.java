package com.example.saycheeze;

import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class NewActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watermark_view);


        Button back = (Button)findViewById(R.id.back);

        back.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "이전화면으로 돌아갑니다.", Toast.LENGTH_LONG).show();

                finish();
            }
        });


        ImageButton button1 = (ImageButton)findViewById(R.id.imageButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView view1 = (ImageView) findViewById(R.id.imageView1);
                view1.setImageResource(R.drawable.mark2);
            }
        });

        ImageButton button2 = (ImageButton)findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView view1 = (ImageView) findViewById(R.id.imageView1);
                view1.setImageResource(R.drawable.mark3);
            }
        });




    }

}
