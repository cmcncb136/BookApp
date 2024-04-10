package com.heybuddy.safespace

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.heybuddy.safespace.databinding.ActivityBookViewerBinding

class ViewerBookActivity: AppCompatActivity() {
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        val bind = ActivityBookViewerBinding.inflate(layoutInflater)
        setContentView(bind.root)

    }
}