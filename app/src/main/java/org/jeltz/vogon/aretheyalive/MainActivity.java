package org.jeltz.vogon.aretheyalive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Passing string when button is pressed */
        Button button = (Button)findViewById(R.id.btn_check);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View button){

                /* get text to pass */
                EditText editText = (EditText)findViewById(R.id.input_name);

                /*start PresentationActivity */
                Intent intent = new Intent(MainActivity.this, PresentationActivity.class);
                intent.putExtra(Intent.EXTRA_TEXT, editText.getText().toString());
                startActivity(intent);
            }
        });


        }
    }

