package com.status.saver.view.custom

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import com.status.saver.R
import com.status.saver.view.util.AppConstants

class SSTextView : androidx.appcompat.widget.AppCompatTextView {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initialise(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initialise(context, attrs)
    }

    private fun initialise(context: Context?, attrs: AttributeSet?) {
        val ary = context!!.obtainStyledAttributes(attrs, R.styleable.SSTextView)
        val fontStyle = ary.getString(R.styleable.SSTextView_font_style)
        val assetManager = context.applicationContext.assets
        typeface = when (fontStyle) {
            "bold" -> {
                Typeface.createFromAsset(assetManager, "fonts/${AppConstants.FONT_NAME_BOLD}")
            }
            "semi_bold" -> {
                Typeface.createFromAsset(assetManager, "fonts/${AppConstants.FONT_SEMI_BOLD}")
            }

            "italic" -> {
                Typeface.createFromAsset(assetManager, "fonts/${AppConstants.FONT_NAME_ITALIC}")
            }
            "medium" -> {
                Typeface.createFromAsset(assetManager, "fonts/${AppConstants.FONT_NAME_MEDIUM}")
            }
            else -> {
                Typeface.createFromAsset(
                    assetManager,
                    "fonts/${AppConstants.FONT_REGULAR}"
                )
            }
        }
        ary.recycle()
    }

}