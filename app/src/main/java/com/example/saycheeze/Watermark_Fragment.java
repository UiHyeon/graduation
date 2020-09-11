package com.example.saycheeze;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
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

import java.security.acl.LastOwnerException;

public class Watermark_Fragment extends Fragment {

        ImageView view1;
        ImageView view2;
private OnTimePointSetListener onTimePointSetListener;


public interface OnTimePointSetListener {
    void OnTimePointSet(int[] imageViewLocation );
}

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof  OnTimePointSetListener) {
            onTimePointSetListener = (OnTimePointSetListener) context;
        }else {
            throw new RuntimeException(context.toString()+"asdfadfasf");
        }
    }

    @Override
    public void onDetach(){
        super.onDetach();
        onTimePointSetListener = null;
    }

    public Watermark_Fragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_watermark, container, false);

        view1 = (ImageView)view.findViewById(R.id.imageView_watermark);
        view2 = ((MainActivity)getActivity()).findViewById(R.id.imageView_activity);

        ImageButton button7 = (ImageButton)view.findViewById(R.id.imageButton7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                view1.setImageResource(R.drawable.background_none);
                view2.setImageResource(R.drawable.background_none);
            }
        });

        ImageButton button1 = (ImageButton)view.findViewById(R.id.imageButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark2);
                view2.setImageResource(R.drawable.mark2);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 100;
                imageViewLocation[1] += 10;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("사용법").setMessage("이렇게 사용하면 좋아요");

                final AlertDialog alertDialog = builder.create();
                //final ImageView imageView = (ImageView)alertDialog.findViewById(R.id.dialog_imageview);
                //imageView.setImageResource(R.drawable.example);

                builder.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });
                alertDialog.show();

            }
        });

        ImageButton button2 = (ImageButton)view.findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark3);
                view2.setImageResource(R.drawable.mark3);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 820;
                imageViewLocation[1] += 220;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button6 = (ImageButton)view.findViewById(R.id.imageButton6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark7);
                view2.setImageResource(R.drawable.mark7);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 400;
                imageViewLocation[1] += 40;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button3 = (ImageButton)view.findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark4);
                view2.setImageResource(R.drawable.mark4);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 300;
                imageViewLocation[1] += 20;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button4 = (ImageButton)view.findViewById(R.id.imageButton4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark5);
                view2.setImageResource(R.drawable.mark5);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 100;
                imageViewLocation[1] += 20;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button5 = (ImageButton)view.findViewById(R.id.imageButton5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark6);
                view2.setImageResource(R.drawable.mark6);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 635;
                imageViewLocation[1] += 130;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button8 = (ImageButton)view.findViewById(R.id.imageButton8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark6);
                view2.setImageResource(R.drawable.mark11);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 635;
                imageViewLocation[1] += 130;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button9 = (ImageButton)view.findViewById(R.id.imageButton9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark6);
                view2.setImageResource(R.drawable.mark12);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 635;
                imageViewLocation[1] += 130;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button10 = (ImageButton)view.findViewById(R.id.imageButton10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark6);
                view2.setImageResource(R.drawable.mark13);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 635;
                imageViewLocation[1] += 130;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button11 = (ImageButton)view.findViewById(R.id.imageButton11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark6);
                view2.setImageResource(R.drawable.mark14);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 635;
                imageViewLocation[1] += 130;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button12 = (ImageButton)view.findViewById(R.id.imageButton12);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark6);
                view2.setImageResource(R.drawable.mark8);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 635;
                imageViewLocation[1] += 130;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button13 = (ImageButton)view.findViewById(R.id.imageButton13);
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark6);
                view2.setImageResource(R.drawable.mark9);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 635;
                imageViewLocation[1] += 130;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button14 = (ImageButton)view.findViewById(R.id.imageButton14);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark6);
                view2.setImageResource(R.drawable.mark10);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 635;
                imageViewLocation[1] += 130;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
            }
        });

        ImageButton button15 = (ImageButton)view.findViewById(R.id.imageButton15);
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                //view1.setImageResource(R.drawable.mark6);
                view2.setImageResource(R.drawable.mark15);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] += 635;
                imageViewLocation[1] += 130;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);
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