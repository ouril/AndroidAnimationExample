package ru.otus.animationexample

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater

class AnimatedView(context: Context, attrs: AttributeSet):
    ConstraintLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.animation_view, this)
    }

}