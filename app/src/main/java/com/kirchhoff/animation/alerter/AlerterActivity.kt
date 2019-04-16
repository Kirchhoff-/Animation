package com.kirchhoff.animation.alerter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.kirchhoff.animation.R
import com.tapadoo.alerter.Alerter

/**
 * @author Kirchhoff-
 */

class AlerterActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_alerter)
        findViewById<View>(R.id.bSimple).setOnClickListener(this)
        findViewById<View>(R.id.bBackground).setOnClickListener(this)
        findViewById<View>(R.id.bIcon).setOnClickListener(this)
        findViewById<View>(R.id.bDuration).setOnClickListener(this)
        findViewById<View>(R.id.bTitle).setOnClickListener(this)
        findViewById<View>(R.id.bOnClickListener).setOnClickListener(this)
        findViewById<View>(R.id.bVerboseText).setOnClickListener(this)
        findViewById<View>(R.id.bAlertVisibilityCallback).setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.bSimple -> alerterSimple()
            R.id.bBackground -> alerterBackground()
            R.id.bIcon -> alerterIcon()
            R.id.bDuration -> alerterDuration()
            R.id.bTitle -> alerterTitle()
            R.id.bOnClickListener -> alerterOnClickListener()
            R.id.bVerboseText -> alerterVerboseText()
            R.id.bAlertVisibilityCallback -> alerterVisibilityCallback()
        }
    }

    private fun alerterSimple() {
        Alerter.create(this)
                .setTitle("Title")
                .setText("Some not long text...")
                .show()
    }

    private fun alerterBackground() {
        Alerter.create(this)
                .setTitle("Title")
                .setBackgroundColor(R.color.colorPrimary)
                .setText("Some not long text...")
                .show()
    }

    private fun alerterIcon() {
        Alerter.create(this)
                .setTitle("Title")
                .setIcon(R.drawable.alerter_ic_face)
                .setText("Some not long text...")
                .show()
    }

    private fun alerterDuration() {
        Alerter.create(this)
                .setTitle("Title")
                .setText("Some not long text...")
                .setDuration(10000)
                .show()
    }

    private fun alerterTitle() {
        Alerter.create(this)
                .setText("Some not long text...")
                .show()
    }

    private fun alerterOnClickListener() {
        Alerter.create(this)
                .setTitle("Title")
                .setText("Some not long text...")
                .setDuration(10000)
                .setOnClickListener { Toast.makeText(this@AlerterActivity, "OnClickListener", Toast.LENGTH_LONG).show() }
                .show()
    }

    private fun alerterVerboseText() {
        Alerter.create(this)
                .setTitle("Title")
                .setText("Some long long long long long long long  text..." +
                        "Some long long long long long long long  text..." +
                        "Some long long long long long long long  text..." +
                        "Some long long long long long long long  text...")
                .setDuration(10000)
                .show()
    }

    private fun alerterVisibilityCallback() {
        Alerter.create(this)
                .setTitle("Title")
                .setText("Some not long text...")
                .setOnShowListener { Toast.makeText(this@AlerterActivity, "Alert Shown", Toast.LENGTH_LONG).show() }
                .setOnHideListener { Toast.makeText(this@AlerterActivity, "Alert Hidden", Toast.LENGTH_LONG).show() }
                .setDuration(3000)
                .show()
    }
}
