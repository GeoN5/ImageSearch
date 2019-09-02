package com.example.mvvm_searchimage.view

import com.example.mvvm_searchimage.R
import com.example.mvvm_searchimage.base.BaseKotlinActivity
import com.example.mvvm_searchimage.databinding.ActivityMainBinding
import com.example.mvvm_searchimage.viewmodel.MainViewModel

//액티비티에서 뷰모델을 선언하면 되는거아니냐! 라고 할 수 있는데, 굳이 이렇게 베이스 뷰에서도 뷰모델을 참조 할 수 있게 한 이유는 스낵바 옵저빙을 위해서입니다.
class MainActivity : BaseKotlinActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutResourceId: Int = R.layout.activity_main

    override val veiwModel: MainViewModel = by viewModel () //koin

    override fun initStartView() {

    }

    override fun initDataBinding() {

    }

    override fun initAfterBinding() {

    }


}
