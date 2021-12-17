package ru.dudar.nasaimage.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import coil.api.load
import ru.dudar.nasaimage.BuildConfig
import ru.dudar.nasaimage.R

class MainActivity : AppCompatActivity() {

    private lateinit var tv : TextView
    private lateinit var imageIV : ImageView
    private val viewModel by viewModels<ImageViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.tv_text)
        imageIV = findViewById(R.id.nasaIV)

        viewModel.imageVM.observe(this, Observer {
            imageIV.load(it.url)
            tv.text= it.explanation

        })


    }
}