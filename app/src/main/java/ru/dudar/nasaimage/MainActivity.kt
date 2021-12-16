package ru.dudar.nasaimage

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.gson.internal.GsonBuildConfig

class MainActivity : AppCompatActivity() {

    private lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.tv_text)
        tv.text=BuildConfig.NASA_API_KEY
    }
}