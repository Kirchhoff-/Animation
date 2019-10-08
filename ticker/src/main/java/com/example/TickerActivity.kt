package com.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.animation.AnticipateInterpolator
import android.view.animation.BounceInterpolator
import android.view.animation.OvershootInterpolator
import com.example.ticker.R
import com.robinhood.ticker.TickerUtils
import com.robinhood.ticker.TickerView
import java.util.*

/**
 * @author Kirchhoff-
 */
class TickerActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tickerView1: TickerView
    private lateinit var tickerView2: TickerView
    private lateinit var tickerView3: TickerView

    private var charList = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_ticker)

        tickerView1 = findViewById(R.id.tickerView1)
        tickerView2 = findViewById(R.id.tickerView2)
        tickerView3 = findViewById(R.id.tickerView3)

        tickerView1.setOnClickListener(this)
        tickerView2.setOnClickListener(this)
        tickerView3.setOnClickListener(this)

        tickerView1.setCharacterLists(TickerUtils.provideNumberList())
        tickerView2.setCharacterLists(TickerUtils.provideAlphabeticalList())
        tickerView3.setCharacterLists(String(charList))

        tickerView1.text = randomIntNumber()
        tickerView2.text = randomDoubleNumber()
        tickerView3.text = randomString()

        tickerView1.animationDuration = 1000
        tickerView2.animationDuration = 2000
        tickerView3.animationDuration = 3000

        tickerView1.animationInterpolator = OvershootInterpolator()
        tickerView2.animationInterpolator = BounceInterpolator()
        tickerView3.animationInterpolator = AnticipateInterpolator()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tickerView1 -> tickerView1.text = randomIntNumber()
            R.id.tickerView2 -> tickerView2.text = randomDoubleNumber()
            R.id.tickerView3 -> tickerView3.text = randomString()
        }
    }

    private fun randomIntNumber() = Random().nextInt(1000).toString()

    private fun randomDoubleNumber() = Random().nextDouble().toString()

    private fun randomString(): String {
        val rand = Random()
        val chars = "abcdefghijklmnopqrstuvwxyz"
        val buf = StringBuilder()
        for (i in 0..9) {
            buf.append(chars[rand.nextInt(chars.length)])
        }
        return buf.toString()
    }
}
