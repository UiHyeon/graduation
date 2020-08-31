package com.example.saycheeze;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Watermark_Fragment extends Fragment {

    ImageView view1;

    public Watermark_Fragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_watermark, container, false);

        view1 = (ImageView)view.findViewById(R.id.imageView1);

        ImageButton button1 = (ImageButton)view.findViewById(R.id.imageButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //view1.setImageDrawable(R.drawable.mark2);
                view1.setImageResource(R.drawable.mark2);
            }
        });

        ImageButton button2 = (ImageButton)view.findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                view1.setImageResource(R.drawable.mark3);
            }
        });

        ImageButton button6 = (ImageButton)view.findViewById(R.id.imageButton6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                view1.setImageResource(R.drawable.mark7);
            }
        });

        ImageButton button3 = (ImageButton)view.findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                view1.setImageResource(R.drawable.mark4);
            }
        });

        ImageButton button4 = (ImageButton)view.findViewById(R.id.imageButton4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                view1.setImageResource(R.drawable.mark5);
            }
        });

        ImageButton button5 = (ImageButton)view.findViewById(R.id.imageButton5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                view1.setImageResource(R.drawable.mark6);
            }
        });

        Button back = (Button)view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "워터마크", Toast.LENGTH_LONG).show();

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Main_Fragment fragment = new Main_Fragment();
                transaction.replace(R.id.fragment, fragment);
                transaction.commit();

                //Intent intent1 = new Intent(getApplicationContext(), NewActivity.class);
                //startActivity(intent1);
            }
        });


        return view;
    }
}
