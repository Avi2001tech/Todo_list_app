package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar1;
    TextView outof1;
    SeekBar seekBar2;
    TextView outof2;
    ImageView add_img;
    LinearLayout front_page;
    LinearLayout top1;
    ImageView decrease;
    ImageView delete;
    ImageView increase;
    String str = "abhi";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar1=findViewById(R.id.seekBar1);
        outof1=findViewById(R.id.outof1);
        seekBar2=findViewById(R.id.seekBar2);
        outof2=findViewById(R.id.outof2);
        add_img=findViewById(R.id.add_img);
        front_page=findViewById(R.id.front_page);
        top1=findViewById(R.id.top1);

        decrease = findViewById(R.id.decrease);
        delete = findViewById(R.id.delete);
        increase = findViewById(R.id.increase);



        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                outof1.setText(i+"/"+"25");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                outof2.setText(i+"/"+"30");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        outof1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (front_page.getVisibility() == View.VISIBLE)
                {
                    front_page.setVisibility(View.INVISIBLE);
                    top1.setVisibility(View.VISIBLE);
                    str = "outof1";

                }

                //openPerformActivity(view);
            }
        });

        outof2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (front_page.getVisibility() == View.VISIBLE)
                {
                    front_page.setVisibility(View.INVISIBLE);
                    top1.setVisibility(View.VISIBLE);
                    str = "outof2";

                }

               // openPerformActivity(view);
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str == "outof1"){
                    int val = seekBar1.getProgress();
                    if(val == 0){
                    Toast.makeText(MainActivity.this, "Cant be decreased further", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        val--;
                        seekBar1.setProgress(val);
                        Toast.makeText(MainActivity.this, "Your progress is updated", Toast.LENGTH_SHORT).show();
                    }
                    top1.setVisibility(View.INVISIBLE);
                    front_page.setVisibility(View.VISIBLE);
                }
                else if(str == "outof2"){
                    int val = seekBar2.getProgress();
                    if(val == 0){
                        Toast.makeText(MainActivity.this, "Cant be decreased further", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        val--;
                        seekBar1.setProgress(val);
                        Toast.makeText(MainActivity.this, "Your progress is updated", Toast.LENGTH_SHORT).show();
                    }
                    top1.setVisibility(View.INVISIBLE);
                    front_page.setVisibility(View.VISIBLE);

                }
                else{
                    Toast.makeText(MainActivity.this, "select any Score to update", Toast.LENGTH_SHORT).show();
                }
            }
        });

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str == "outof1"){
                    int val = seekBar1.getProgress();
                    if(val == seekBar1.getMax()){
                        Toast.makeText(MainActivity.this, "Cant be increased further", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        val++;
                        seekBar1.setProgress(val);
                        Toast.makeText(MainActivity.this, "Your progress is updated", Toast.LENGTH_SHORT).show();
                    }
                    top1.setVisibility(View.INVISIBLE);
                    front_page.setVisibility(View.VISIBLE);
                }
                else if(str == "outof2"){
                    int val = seekBar2.getProgress();
                    if(val == seekBar2.getMax()){
                        Toast.makeText(MainActivity.this, "Cant be increased further", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        val++;
                        seekBar2.setProgress(val);
                        Toast.makeText(MainActivity.this, "Your progress is updated", Toast.LENGTH_SHORT).show();
                    }
                    top1.setVisibility(View.INVISIBLE);
                    front_page.setVisibility(View.VISIBLE);

                }
                else{
                    Toast.makeText(MainActivity.this, "select any Score to update", Toast.LENGTH_SHORT).show();;
                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str == "outof1"){
                    seekBar1.setProgress(0);
                    Toast.makeText(MainActivity.this, "Your progress will begin from starting", Toast.LENGTH_SHORT).show();
                    top1.setVisibility(View.INVISIBLE);
                    front_page.setVisibility(View.VISIBLE);
                }
                else if(str == "outof2"){
                    seekBar2.setProgress(0);
                    Toast.makeText(MainActivity.this, "Your progress will begin from starting", Toast.LENGTH_SHORT).show();
                    top1.setVisibility(View.INVISIBLE);
                    front_page.setVisibility(View.VISIBLE);

                }
                else{
                    Toast.makeText(MainActivity.this, "select any Score to update", Toast.LENGTH_SHORT).show();;
                }
            }
        });
    }


    public void openNewActivity(View view){
        Toast.makeText(this, "Create your new task", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, AddTask.class);
        startActivity(intent);
    }


}

