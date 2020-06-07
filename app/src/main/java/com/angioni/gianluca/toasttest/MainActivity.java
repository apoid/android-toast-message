package com.angioni.gianluca.toasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * Simple short Toast
         */
        //Toast.makeText(this, "Simple short Toast", Toast.LENGTH_SHORT).show();

        /**
         * Toast with gravity
         */
        //Toast toast = Toast.makeText(this, "Short Toast with some gravity", Toast.LENGTH_SHORT);
        //toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT,80, 160 );
        //toast.show();

        /**
         * TOAST WITH CUSTOM LAYOUT
         *
         * We declare first an inflater;
         * Then we use the inflater to inflate our custom layout;
         * From our custom layout we get its TextView;
         * We finally add to our TextView a String message;
         * ...
         */
        LayoutInflater inflater = getLayoutInflater();
        View customLayout = inflater.inflate(R.layout.custom_layout, (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView customText = customLayout.findViewById(R.id.custom_text);
        customText.setText("Custom Layout Text!!");

        /**
         * ...
         * We get the application's context to initialize the Toast;
         * Then we set gravity and duration;
         * Next we set the view inflated before (customLayout);
         * We finally show our Toast message;
         */
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT,80, 160 );
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(customLayout);
        toast.show();
    }
}
