package com.example.beaconpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class DeviceList extends AppCompatActivity {

    Dialog dataDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_list);
        dataDialog = new Dialog(this);
    }

    public void ShowPopup(View v) {
        TextView btnClose;
        dataDialog.setContentView(R.layout.device_data);
        btnClose = (TextView) dataDialog.findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataDialog.dismiss();
            }
        });
        dataDialog.show();
    }

    public void displayToast(View v) {
        Toast.makeText(DeviceList.this, "Data has been sent", Toast.LENGTH_SHORT).show();
    }
}