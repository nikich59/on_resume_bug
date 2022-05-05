package com.example.on_resume_bug

import android.transition.Fade
import android.transition.TransitionSet
import android.view.animation.DecelerateInterpolator


val DEFAULT_TRANSITION = TransitionSet().also { transitionSet ->
    val fade = Fade()
    fade.duration = 1000L

    transitionSet.interpolator = DecelerateInterpolator(2f)
    transitionSet.addTransition(fade)
}
