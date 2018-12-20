package org.jeltz.vogon.aretheyalive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PresentationActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);

            /* Showing string we passed as placeholder to see data transfer works */
            Intent intent = getIntent();
            String name = intent.getStringExtra(intent.getStringExtra(intent.EXTRA_TEXT));

            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(name);
    }
}
