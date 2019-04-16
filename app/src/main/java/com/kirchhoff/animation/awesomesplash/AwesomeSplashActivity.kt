package com.kirchhoff.animation.awesomesplash

import com.daimajia.androidanimations.library.Techniques
import com.kirchhoff.animation.R
import com.viksaa.sssplash.lib.activity.AwesomeSplash
import com.viksaa.sssplash.lib.cnst.Flags
import com.viksaa.sssplash.lib.model.ConfigSplash

class AwesomeSplashActivity : AwesomeSplash() {

    override fun initSplash(configSplash: ConfigSplash) {
        configSplash.backgroundColor = R.color.colorAccent
        configSplash.animCircularRevealDuration = 3000
        configSplash.revealFlagX = Flags.REVEAL_RIGHT
        configSplash.revealFlagY = Flags.REVEAL_BOTTOM

        configSplash.logoSplash = R.mipmap.ic_launcher
        configSplash.animLogoSplashDuration = 2000
        configSplash.animLogoSplashTechnique = Techniques.Bounce

        configSplash.pathSplash = Images.GITHUB_LOGO //set path String
        configSplash.animPathStrokeDrawingDuration = 3000
        configSplash.pathSplashStrokeSize = 3
        configSplash.pathSplashStrokeColor = R.color.colorPrimary
        configSplash.animPathFillingDuration = 3000
        configSplash.pathSplashFillColor = R.color.yellow

        configSplash.titleSplash = "AwesomeSplash library test"
        configSplash.titleTextColor = R.color.yellow
        configSplash.titleTextSize = 24f //float value
        configSplash.animTitleDuration = 3000
        configSplash.animTitleTechnique = Techniques.FlipInX
    }

    override fun animationsFinished() {
        this.finish()
    }
}
