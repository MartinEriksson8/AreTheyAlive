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
    }

    /* Passing string when button is pressed */
        public void sendText(View view){

            EditText editText = findViewById(R.id.input_name);
            String name = editText.getText().toString();


            Intent intent = new Intent(this,PresentationActivity.class);
            intent.putExtra("CHECK_NAME", name);
            startActivity(intent);
        }
}


