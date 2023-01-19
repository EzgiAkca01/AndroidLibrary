package com.ezgiakca.customwebviewpreview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.ezgiakca.customwebviewpreview.databinding.ActivityCustomWebViewBinding

class CustomWebViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCustomWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        webViewSetup()
    }

    private fun webViewSetup() {
        val customWebView = binding.customWebView
        customWebView.webViewClient = WebViewClient()
        customWebView.apply {
            loadUrl("https://internetsubesi.akbank.com/WebApplication.UI/entrypoint.aspx")
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.allowContentAccess = true
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                settings.safeBrowsingEnabled = true
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()

    }
}