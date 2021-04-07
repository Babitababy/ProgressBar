package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int progress=0;
   Button buttonIncrement;
   Button buttonDecrement;
   ProgressBar progressBar;
   TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDecrement=(Button)findViewById(R.id.button_decr);
        buttonIncrement=(Button)findViewById(R.id.button_incr);
        progressBar=(ProgressBar)findViewById(R.id.progress_bar);
        textView = (TextView)findViewById(R.id.text_view_progress);

        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(progress <= 90)
                {
                    progress+=10;
                    updateProgressBar();
                }

            }
        });

        buttonDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(progress >= 10)
                {
                    progress-=10;
                    updateProgressBar();
                }
            }
        });


    }

    private void updateProgressBar()
    {
        progressBar.setProgress(progress);
        textView.setText(String.valueOf(progress));
    }
}