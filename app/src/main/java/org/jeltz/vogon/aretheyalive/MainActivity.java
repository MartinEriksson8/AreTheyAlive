package org.jeltz.vogon.aretheyalive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Passing string when button is pressed */
        SendEditTextValue = (Button)findViewById(R.id.btn_check);


    }
}
