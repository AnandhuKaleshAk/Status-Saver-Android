package com.status.saver.view.util

import android.annotation.SuppressLint
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment
import com.status.saver.R

class LoaderFragment private constructor() : DialogFragment() {

    companion object {
        private var instance: LoaderFragment? = null
        fun getInstance(): LoaderFragment? {
            if (instance != null) {
                instance?.dismiss()
            }
            instance = LoaderFragment()
            return instance
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.progress_layout, container, false)
        dialog!!.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        dialog!!.window!!.setBackgroundDrawable(ColorDrawable(0))
        dialog!!.setCancelable(false)
        dialog!!.setCanceledOnTouchOutside(false)
        return v
    }


}