package com.heybuddy.safespace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heybuddy.safespace.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.tv.text = bind.tv.text.toString() + " : bind"


    }
}