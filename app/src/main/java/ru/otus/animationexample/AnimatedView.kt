package ru.otus.animationexample

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.animation_view.view.*
import android.graphics.drawable.AnimationDrawable



class AnimatedView(context: Context, attrs: AttributeSet):
    ConstraintLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.animation_view, this)
        imageView.setBackgroundResource(R.drawable.animation_list)
        val animationDrawable = imageView.background as AnimationDrawable
        animationDrawable.start()

    }

}