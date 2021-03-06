package ru.otus.animationexample

import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.constraint.ConstraintLayout
import android.transition.Slide
import android.transition.TransitionManager
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.main_view.view.*

class MainView(
    context: Context,
    attrs: AttributeSet
): ConstraintLayout(context, attrs) {
    private val activity: MainActivity = context as MainActivity

    init {
        LayoutInflater.from(context).inflate(R.layout.main_view, this)
        var visible = false
        button.setOnClickListener {


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                TransitionManager.beginDelayedTransition(this, Slide(Gravity.BOTTOM))
                visible = !visible
                animatedView.visibility = if (visible) View.VISIBLE else View.GONE

            }

        }

        key_button.setOnClickListener {
            val intent = Intent(activity, AnimationActivity::class.java)
            activity.startActivity(intent)
            activity.overridePendingTransition(R.anim.appear, R.anim.hide);
        }

    }
}
