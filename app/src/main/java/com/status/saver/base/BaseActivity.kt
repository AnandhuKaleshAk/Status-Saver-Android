package com.status.saver.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<T: ViewDataBinding>(@LayoutRes private val layoutRes:Int) :
AppCompatActivity() {

    private var _binding:T?=null
    private val binding:T get() =_binding!!

    open fun  T.initialize(){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding=DataBindingUtil.setContentView(this,layoutRes)
        binding.lifecycleOwner=this
        binding.initialize()
    }

    private fun showLoader(){

    }

    private fun hideLoader(){


    }
}