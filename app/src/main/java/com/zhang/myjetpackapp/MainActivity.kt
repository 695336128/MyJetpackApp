package com.zhang.myjetpackapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleObserver
import com.zhang.myjetpackapp.databinding.MainActivityBinding
import com.zhang.myjetpackapp.ui.index.IndexFragment
import com.zhang.myjetpackapp.ui.main.MainFragment

class MainActivity : AppCompatActivity(),LifecycleObserver{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<MainActivityBinding>(this,R.layout.main_activity)
    }

}
