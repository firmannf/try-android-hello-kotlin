package me.firmannizammudin.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickMe = findViewById(R.id.main_button_click) as Button
        buttonClickMe.setOnClickListener {
            Toast.makeText(this, "Hello Kotlin, Nice to Meet You!", Toast.LENGTH_SHORT).show()
        }
    }
}
