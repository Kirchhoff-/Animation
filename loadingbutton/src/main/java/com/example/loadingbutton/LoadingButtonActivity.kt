package com.example.loadingbutton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.dx.dxloadingbutton.lib.LoadingButton

class LoadingButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_loading_button)
        val loadingButton = findViewById<LoadingButton>(R.id.loadingButton)
        loadingButton.setOnClickListener { loadingButton.startLoading() }
        findViewById<View>(R.id.bSuccess).setOnClickListener { loadingButton.loadingSuccessful() }
        findViewById<View>(R.id.bFailed).setOnClickListener { loadingButton.loadingFailed() }
        findViewById<View>(R.id.bReset).setOnClickListener { loadingButton.reset() }
        findViewById<View>(R.id.bCancel).setOnClickListener { loadingButton.cancelLoading() }
    }
}
