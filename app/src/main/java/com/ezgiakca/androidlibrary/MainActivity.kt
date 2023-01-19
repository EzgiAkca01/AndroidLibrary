package com.ezgiakca.androidlibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ezgiakca.customwebviewpreview.CustomWebViewActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val page = Intent(this, CustomWebViewActivity::class.java)
        startActivity(page)
    }
}