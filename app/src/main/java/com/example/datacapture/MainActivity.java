package com.example.datacapture;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button btnCaptureNewJob;
    Button btnViewCapturedJobs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCaptureNewJob = findViewById(R.id.btnBack);
        btnViewCapturedJobs = findViewById(R.id.btnViewJobs);

        View.OnClickListener handler = new View.OnClickListener(){

            public void onClick(View v) {

                if(v==btnCaptureNewJob){
                    Intent intentMain = new Intent(MainActivity.this ,
                            CaptureActivity.class);
                    MainActivity.this.startActivity(intentMain);
                    Log.i("Content "," Main layout ");
                }

                if(v==btnViewCapturedJobs){
                    // doStuff
                    Intent intentApp = new Intent(MainActivity.this,
                            ViewJobsActivity.class);

                    MainActivity.this.startActivity(intentApp);

                    Log.i("Content "," App layout ");

                }
            }
        };

        btnCaptureNewJob.setOnClickListener(handler);
        btnViewCapturedJobs.setOnClickListener(handler);
    }


}