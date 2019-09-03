package com.example.mvvm_searchimage.view

import com.example.mvvm_searchimage.R
import com.example.mvvm_searchimage.base.BaseKotlinActivity
import com.example.mvvm_searchimage.databinding.ActivityMainBinding
import com.example.mvvm_searchimage.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : BaseKotlinActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutResourceId: Int = R.layout.activity_main

    override val viewModel : MainViewModel by viewModel()

    override fun initStartView() {

    }

    override fun initDataBinding() {

    }

    override fun initAfterBinding() {

    }


}
