package ru.dudar.nasaimage.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.dudar.nasaimage.R
import ru.dudar.nasaimage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val imageFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (imageFragment == null) {
            val fragment = ImageFragment.newInstance()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }


    }
}