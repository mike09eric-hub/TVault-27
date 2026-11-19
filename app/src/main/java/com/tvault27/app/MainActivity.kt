package com.tvault27.app

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.graphics.Color
import android.view.View
import android.view.WindowManager

class MainActivity : Activity() {
    private lateinit var web: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.rgb(8, 15, 26)
        window.navigationBarColor = Color.rgb(8, 15, 26)
        window.decorView.systemUiVisibility = 0
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        web = WebView(this)
        web.setBackgroundColor(Color.rgb(8, 15, 26))
        web.webViewClient = WebViewClient()
        web.webChromeClient = WebChromeClient()
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.databaseEnabled = true
        web.settings.cacheMode = WebSettings.LOAD_DEFAULT
        web.settings.allowFileAccess = true
        web.settings.allowContentAccess = true
        web.settings.setSupportZoom(false)
        web.loadUrl("file:///android_asset/index.html")
        setContentView(web)
    }
    @Deprecated("Deprecated in Android")
    override fun onBackPressed() {
        if (web.canGoBack()) web.goBack() else super.onBackPressed()
    }
}
