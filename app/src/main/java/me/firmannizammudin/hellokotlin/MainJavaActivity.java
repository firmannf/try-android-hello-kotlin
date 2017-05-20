package me.firmannizammudin.hellokotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonClickMe = (Button) findViewById(R.id.main_button_click);
        buttonClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainJavaActivity.this, "Hello Java, Long Time No See!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
