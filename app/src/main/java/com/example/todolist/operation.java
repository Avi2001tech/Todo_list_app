package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class operation extends AppCompatActivity {
    ImageView decrease;
    ImageView delete;
    ImageView increase;
    SeekBar seekBar1;
    SeekBar seekBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);
        seekBar1 = findViewById(R.id.seekBar1);
        seekBar2 = findViewById(R.id.seekBar2);

        int progress1 = seekBar1.getProgress();
        int progress2 = seekBar2.getProgress();

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(operation.this, "Still Thinking", Toast.LENGTH_SHORT).show();
            }
        });
    }
}