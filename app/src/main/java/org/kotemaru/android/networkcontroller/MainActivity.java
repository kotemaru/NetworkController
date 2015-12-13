package org.kotemaru.android.networkcontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickWifi(View view) {
        NetworkUtil.setWifiEnabled(this, ((Switch)view).isChecked());
    }

    public void onClickMobile(View view) {
        try {
            NetworkUtil.setMobileDataEnabled(this, ((Switch) view).isChecked());
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    public void onClickAirPlane(View view) {
        try {
            NetworkUtil.setAirplaneMode(this, ((Switch) view).isChecked());
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
