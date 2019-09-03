package com.example.mvvm_searchimage.di

import com.example.mvvm_searchimage.model.DataModel
import com.example.mvvm_searchimage.model.DataModelImpl
import com.example.mvvm_searchimage.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val modelPart = module {
    //factory : 매번 새로 인스턴스 생성
    factory<DataModel> { DataModelImpl() }
}

val viewModelPart = module {
    viewModel { MainViewModel(get()) }
}

val myDiModule = listOf(modelPart, viewModelPart)