package com.example.datacapture;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CaptureActivity extends AppCompatActivity {
    Button captureNewJob;
    EditText edtJobNumber;
    EditText edtStreetAddress;
    EditText edtSuburb;
    EditText edtCity;
    EditText edtPostalCode;
    EditText edtOldMeterNumber;
    EditText edtNewMeterNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);

        captureNewJob = findViewById(R.id.btnBack);
        edtJobNumber = findViewById(R.id.edtJobNumber);
        edtStreetAddress = findViewById(R.id.edtStreetAddress);
        edtSuburb = findViewById(R.id.edtSuburb);
        edtCity = findViewById(R.id.edtCity);
        edtPostalCode = findViewById(R.id.edtPostalCode);
        edtOldMeterNumber = findViewById(R.id.edtOldMeterNumber);
        edtNewMeterNumber = findViewById(R.id.edtNewMeterNumber);

        captureNewJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMsg(v);
            }
        });
    }

    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayToastMsg(View v) {
        toastMsg("job number : " + edtJobNumber.getText() +
                "\nStreet Address : " + edtStreetAddress.getText() +
                "\nSuburb : " + edtSuburb.getText() +
                "\nCity : " + edtCity.getText() +
                "\nPostal Code : " + edtPostalCode.getText() +
                "\nOld meter number : " + edtOldMeterNumber.getText() +
                "\nNew meter number : " + edtNewMeterNumber.getText()
        );
    }
}